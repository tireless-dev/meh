// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Attachment: ImageVector
  get() {
    val current = _attachment
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Attachment",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m28.1 18.9 -15 -15 c-2.5 -2.6 -6.6 -2.6 -9.2 -.1 s-2.6 6.7 0 9.2 L4 13.1 6.8 16 l1.4 -1.4 -2.9 -2.9 c-1.7 -1.7 -1.7 -4.6 0 -6.3 s4.6 -1.8 6.3 -.1 l.1 .1 14.9 14.9 c1.8 1.7 1.8 4.6 .1 6.3 a4.44 4.44 0 0 1 -6.3 .1 l-.1 -.1 -7.4 -7.4 c-1 -1 -.9 -2.6 0 -3.5 1 -.9 2.5 -.9 3.5 0 l4.1 4.1 1.4 -1.4 -4.2 -4.2 a4.44 4.44 0 0 0 -6.3 .2 4.6 4.6 0 0 0 0 6.2 l7.5 7.5 c2.5 2.6 6.6 2.6 9.2 .1 s2.6 -6.7 0 -9.3 c0 .1 0 0 0 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.1 18.9
          moveTo(x = 28.1f, y = 18.9f)
          // l -15 -15
          lineToRelative(dx = -15.0f, dy = -15.0f)
          // c -2.5 -2.6 -6.6 -2.6 -9.2 -0.1
          curveToRelative(
            dx1 = -2.5f,
            dy1 = -2.6f,
            dx2 = -6.6f,
            dy2 = -2.6f,
            dx3 = -9.2f,
            dy3 = -0.1f,
          )
          // s -2.6 6.7 0 9.2
          reflectiveCurveToRelative(
            dx1 = -2.6f,
            dy1 = 6.7f,
            dx2 = 0.0f,
            dy2 = 9.2f,
          )
          // L 4 13.1
          lineTo(x = 4.0f, y = 13.1f)
          // L 6.8 16
          lineTo(x = 6.8f, y = 16.0f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -2.9 -2.9
          lineToRelative(dx = -2.9f, dy = -2.9f)
          // c -1.7 -1.7 -1.7 -4.6 0 -6.3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = -1.7f,
            dx2 = -1.7f,
            dy2 = -4.6f,
            dx3 = 0.0f,
            dy3 = -6.3f,
          )
          // s 4.6 -1.8 6.3 -0.1
          reflectiveCurveToRelative(
            dx1 = 4.6f,
            dy1 = -1.8f,
            dx2 = 6.3f,
            dy2 = -0.1f,
          )
          // l 0.1 0.1
          lineToRelative(dx = 0.1f, dy = 0.1f)
          // l 14.9 14.9
          lineToRelative(dx = 14.9f, dy = 14.9f)
          // c 1.8 1.7 1.8 4.6 0.1 6.3
          curveToRelative(
            dx1 = 1.8f,
            dy1 = 1.7f,
            dx2 = 1.8f,
            dy2 = 4.6f,
            dx3 = 0.1f,
            dy3 = 6.3f,
          )
          // a 4.44 4.44 0 0 1 -6.3 0.1
          arcToRelative(
            a = 4.44f,
            b = 4.44f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -6.3f,
            dy1 = 0.1f,
          )
          // l -0.1 -0.1
          lineToRelative(dx = -0.1f, dy = -0.1f)
          // l -7.4 -7.4
          lineToRelative(dx = -7.4f, dy = -7.4f)
          // c -1 -1 -0.9 -2.6 0 -3.5
          curveToRelative(
            dx1 = -1.0f,
            dy1 = -1.0f,
            dx2 = -0.9f,
            dy2 = -2.6f,
            dx3 = 0.0f,
            dy3 = -3.5f,
          )
          // c 1 -0.9 2.5 -0.9 3.5 0
          curveToRelative(
            dx1 = 1.0f,
            dy1 = -0.9f,
            dx2 = 2.5f,
            dy2 = -0.9f,
            dx3 = 3.5f,
            dy3 = 0.0f,
          )
          // l 4.1 4.1
          lineToRelative(dx = 4.1f, dy = 4.1f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -4.2 -4.2
          lineToRelative(dx = -4.2f, dy = -4.2f)
          // a 4.44 4.44 0 0 0 -6.3 0.2
          arcToRelative(
            a = 4.44f,
            b = 4.44f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.3f,
            dy1 = 0.2f,
          )
          // a 4.6 4.6 0 0 0 0 6.2
          arcToRelative(
            a = 4.6f,
            b = 4.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 6.2f,
          )
          // l 7.5 7.5
          lineToRelative(dx = 7.5f, dy = 7.5f)
          // c 2.5 2.6 6.6 2.6 9.2 0.1
          curveToRelative(
            dx1 = 2.5f,
            dy1 = 2.6f,
            dx2 = 6.6f,
            dy2 = 2.6f,
            dx3 = 9.2f,
            dy3 = 0.1f,
          )
          // s 2.6 -6.7 0 -9.3
          reflectiveCurveToRelative(
            dx1 = 2.6f,
            dy1 = -6.7f,
            dx2 = 0.0f,
            dy2 = -9.3f,
          )
          // c 0 0.1 0 0 0 0
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.1f,
            dx2 = 0.0f,
            dy2 = 0.0f,
            dx3 = 0.0f,
            dy3 = 0.0f,
          )
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
      ) {
        // M 0 0
        moveTo(x = 0.0f, y = 0.0f)
        // h 32
        horizontalLineToRelative(dx = 32.0f)
        // v 32
        verticalLineToRelative(dy = 32.0f)
        // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _attachment = it }
  }

@Suppress("ObjectPropertyName")
private var _attachment: ImageVector? = null
