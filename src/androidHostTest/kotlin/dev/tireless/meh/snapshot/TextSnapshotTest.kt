// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev

package dev.tireless.meh.snapshot

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.captureRoboImage
import dev.tireless.meh.component.FormHelper
import dev.tireless.meh.component.FormLabel
import dev.tireless.meh.component.Text
import dev.tireless.meh.preview.PreviewTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35], qualifiers = "w400dp-h800dp-xxhdpi")
class TextSnapshotTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun textDefault() {
    composeTestRule.setContent {
      PreviewTheme {
        Text("Body 01")
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun textDisabled() {
    composeTestRule.setContent {
      PreviewTheme {
        Text(text = "Disabled body", enabled = false)
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun formLabel() {
    composeTestRule.setContent {
      PreviewTheme {
        FormLabel(text = "Label")
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun formHelper() {
    composeTestRule.setContent {
      PreviewTheme {
        FormHelper(text = "Helper text that wraps to multiple lines for inspection.")
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }

  @Test
  fun textAllVariants() {
    composeTestRule.setContent {
      PreviewTheme {
        Column(
          modifier = Modifier.fillMaxWidth(),
          horizontalAlignment = Alignment.Start,
        ) {
          Text("Body 01")
          Text(text = "Disabled body", enabled = false)
          Spacer(Modifier.height(8.dp))
          FormLabel(text = "Label")
          FormHelper(text = "Helper text that wraps to multiple lines for inspection.")
        }
      }
    }
    composeTestRule.onRoot().captureRoboImage()
  }
}
