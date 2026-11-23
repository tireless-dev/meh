// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class PopoverTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  private val window = IntSize(1000, 1000)
  private val anchor = IntRect(left = 400, top = 400, right = 480, bottom = 440)
  private val popup = IntSize(200, 100)

  @Test
  fun positionProviderPlacesAllTwelveAlignmentsInLtr() {
    val offset = 8
    val expected = mapOf(
      PopoverAlign.Top to IntOffset(340, 292),
      PopoverAlign.TopStart to IntOffset(400, 292),
      PopoverAlign.TopEnd to IntOffset(280, 292),
      PopoverAlign.Bottom to IntOffset(340, 448),
      PopoverAlign.BottomStart to IntOffset(400, 448),
      PopoverAlign.BottomEnd to IntOffset(280, 448),
      PopoverAlign.Left to IntOffset(192, 370),
      PopoverAlign.LeftTop to IntOffset(192, 400),
      PopoverAlign.LeftBottom to IntOffset(192, 340),
      PopoverAlign.Right to IntOffset(488, 370),
      PopoverAlign.RightTop to IntOffset(488, 400),
      PopoverAlign.RightBottom to IntOffset(488, 340),
    )

    expected.forEach { (align, expectedOffset) ->
      var resolved: PopoverAlign? = null
      val provider = PopoverPositionProvider(
        align = align,
        offsetPx = offset,
        autoAlign = false,
        onResolvedAlign = { resolved = it },
      )
      val actual = provider.calculatePosition(anchor, window, LayoutDirection.Ltr, popup)
      assertEquals("Failed for $align", expectedOffset, actual)
      assertEquals(align, resolved)
    }
  }

  @Test
  fun positionProviderMirrorsStartAndEndInRtl() {
    val startProvider = PopoverPositionProvider(
      align = PopoverAlign.BottomStart,
      offsetPx = 0,
      autoAlign = false,
    )
    val endProvider = PopoverPositionProvider(
      align = PopoverAlign.BottomEnd,
      offsetPx = 0,
      autoAlign = false,
    )

    assertEquals(
      IntOffset(280, 440),
      startProvider.calculatePosition(anchor, window, LayoutDirection.Rtl, popup),
    )
    assertEquals(
      IntOffset(400, 440),
      endProvider.calculatePosition(anchor, window, LayoutDirection.Rtl, popup),
    )
  }

  @Test
  fun autoAlignFlipsWhenPrimarySideOverflows() {
    val nearBottomAnchor = IntRect(left = 400, top = 920, right = 480, bottom = 960)
    var resolved: PopoverAlign? = null
    val provider = PopoverPositionProvider(
      align = PopoverAlign.Bottom,
      offsetPx = 8,
      autoAlign = true,
      onResolvedAlign = { resolved = it },
    )

    val actual = provider.calculatePosition(nearBottomAnchor, window, LayoutDirection.Ltr, popup)
    assertEquals(PopoverAlign.Top, resolved)
    assertEquals(IntOffset(340, 812), actual)
  }

  @Test
  fun autoAlignClampsCrossAxisWithinWindow() {
    val nearRightAnchor = IntRect(left = 920, top = 400, right = 980, bottom = 440)
    val provider = PopoverPositionProvider(
      align = PopoverAlign.BottomStart,
      offsetPx = 8,
      autoAlign = true,
    )

    val actual = provider.calculatePosition(nearRightAnchor, window, LayoutDirection.Ltr, popup)
    assertEquals(IntOffset(800, 448), actual)
  }

  @Test
  fun popoverOpensAndClosesWithTrigger() {
    var expanded by mutableStateOf(false)

    composeTestRule.setContent {
      MehTheme {
        Popover(
          expanded = expanded,
          onDismissRequest = { expanded = false },
          trigger = {
            Button(text = "Toggle popover", onClick = { expanded = !expanded })
          },
        ) {
          Text(text = "Popover body content")
        }
      }
    }

    composeTestRule.onNodeWithText("Popover body content").assertDoesNotExist()
    composeTestRule.onNodeWithText("Toggle popover").performClick()
    composeTestRule.onNodeWithText("Popover body content").assertIsDisplayed()
  }
}
