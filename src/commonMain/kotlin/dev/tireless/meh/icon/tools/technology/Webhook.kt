// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Webhook: ImageVector
  get() {
    val current = _webhook
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Webhook",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 26 a3 3 0 1 0 -2.82 -4 H13 v1 a5 5 0 1 1 -5 -5 v-2 a7 7 0 1 0 6.93 8 h6.25 A3 3 0 0 0 24 26
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 26
          moveTo(x = 24.0f, y = 26.0f)
          // a 3 3 0 1 0 -2.82 -4
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = -4.0f,
          )
          // H 13
          horizontalLineTo(x = 13.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 5 5 0 1 1 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 7 7 0 1 0 6.93 8
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.93f,
            dy1 = 8.0f,
          )
          // h 6.25
          horizontalLineToRelative(dx = 6.25f)
          // A 3 3 0 0 0 24 26
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 26.0f,
          )
        }
        // M24 16 a7 7 0 0 0 -2.57 .49 l-3.17 -5.54 a3.05 3.05 0 1 0 -1.73 1 l4.12 7.2 .87 -.5 a5 5 0 1 1 -1.85 6.85 l-1.73 1 A7 7 0 1 0 24 16
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 16
          moveTo(x = 24.0f, y = 16.0f)
          // a 7 7 0 0 0 -2.57 0.49
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.57f,
            dy1 = 0.49f,
          )
          // l -3.17 -5.54
          lineToRelative(dx = -3.17f, dy = -5.54f)
          // a 3.05 3.05 0 1 0 -1.73 1
          arcToRelative(
            a = 3.05f,
            b = 3.05f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.73f,
            dy1 = 1.0f,
          )
          // l 4.12 7.2
          lineToRelative(dx = 4.12f, dy = 7.2f)
          // l 0.87 -0.5
          lineToRelative(dx = 0.87f, dy = -0.5f)
          // a 5 5 0 1 1 -1.85 6.85
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -1.85f,
            dy1 = 6.85f,
          )
          // l -1.73 1
          lineToRelative(dx = -1.73f, dy = 1.0f)
          // A 7 7 0 1 0 24 16
          arcTo(
            horizontalEllipseRadius = 7.0f,
            verticalEllipseRadius = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 16.0f,
          )
        }
        // M8.53 20.05 a3.03 3.03 0 1 0 1.73 1 l3.63 -6.34 .5 -.87 -.87 -.5 a5 5 0 1 1 6.81 -1.84 l1.73 1 a7 7 0 1 0 -10.34 2.04 152 152 0 0 0 -2.08 3.57Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.53 20.05
          moveTo(x = 8.53f, y = 20.05f)
          // a 3.03 3.03 0 1 0 1.73 1
          arcToRelative(
            a = 3.03f,
            b = 3.03f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.73f,
            dy1 = 1.0f,
          )
          // l 3.63 -6.34
          lineToRelative(dx = 3.63f, dy = -6.34f)
          // l 0.5 -0.87
          lineToRelative(dx = 0.5f, dy = -0.87f)
          // l -0.87 -0.5
          lineToRelative(dx = -0.87f, dy = -0.5f)
          // a 5 5 0 1 1 6.81 -1.84
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.81f,
            dy1 = -1.84f,
          )
          // l 1.73 1
          lineToRelative(dx = 1.73f, dy = 1.0f)
          // a 7 7 0 1 0 -10.34 2.04
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -10.34f,
            dy1 = 2.04f,
          )
          // a 152 152 0 0 0 -2.08 3.57z
          arcToRelative(
            a = 152.0f,
            b = 152.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.08f,
            dy1 = 3.57f,
          )
          close()
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
      .also { _webhook = it }
  }

@Suppress("ObjectPropertyName")
private var _webhook: ImageVector? = null
