// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ConvertToCloud: ImageVector
  get() {
    val current = _convertToCloud
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ConvertToCloud",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26.5 12 H19 a4 4 0 0 1 0 -8 h.08 A4.8 4.8 0 0 1 23 2 a5 5 0 0 1 4.65 3.2 A3.5 3.5 0 0 1 30 8.5 a3.5 3.5 0 0 1 -3.5 3.5 M19 6 a2 2 0 0 0 0 4 h7.5 A1.5 1.5 0 0 0 28 8.5 a1.5 1.5 0 0 0 -1.28 -1.47 l-.66 -.1 -.16 -.65 a2.96 2.96 0 0 0 -5.49 -.71 L20.11 6Z m4 8 -5 5 1.41 1.41 L22 17.83 V24 h-6 v2 h6 a2 2 0 0 0 2 -2 v-6.17 l2.59 2.59 L28 19Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.5 12
          moveTo(x = 26.5f, y = 12.0f)
          // H 19
          horizontalLineTo(x = 19.0f)
          // a 4 4 0 0 1 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // h 0.08
          horizontalLineToRelative(dx = 0.08f)
          // A 4.8 4.8 0 0 1 23 2
          arcTo(
            horizontalEllipseRadius = 4.8f,
            verticalEllipseRadius = 4.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 2.0f,
          )
          // a 5 5 0 0 1 4.65 3.2
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.65f,
            dy1 = 3.2f,
          )
          // A 3.5 3.5 0 0 1 30 8.5
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 8.5f,
          )
          // a 3.5 3.5 0 0 1 -3.5 3.5
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.5f,
            dy1 = 3.5f,
          )
          // M 19 6
          moveTo(x = 19.0f, y = 6.0f)
          // a 2 2 0 0 0 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // h 7.5
          horizontalLineToRelative(dx = 7.5f)
          // A 1.5 1.5 0 0 0 28 8.5
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 8.5f,
          )
          // a 1.5 1.5 0 0 0 -1.28 -1.47
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.28f,
            dy1 = -1.47f,
          )
          // l -0.66 -0.1
          lineToRelative(dx = -0.66f, dy = -0.1f)
          // l -0.16 -0.65
          lineToRelative(dx = -0.16f, dy = -0.65f)
          // a 2.96 2.96 0 0 0 -5.49 -0.71
          arcToRelative(
            a = 2.96f,
            b = 2.96f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.49f,
            dy1 = -0.71f,
          )
          // L 20.11 6z
          lineTo(x = 20.11f, y = 6.0f)
          close()
          // m 4 8
          moveToRelative(dx = 4.0f, dy = 8.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 22 17.83
          lineTo(x = 22.0f, y = 17.83f)
          // V 24
          verticalLineTo(y = 24.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -6.17
          verticalLineToRelative(dy = -6.17f)
          // l 2.59 2.59
          lineToRelative(dx = 2.59f, dy = 2.59f)
          // L 28 19z
          lineTo(x = 28.0f, y = 19.0f)
          close()
        }
        // <rect width="10" height="2" x="2.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 20
          moveTo(x = 2.0f, y = 20.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="2.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 24
          moveTo(x = 2.0f, y = 24.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="2.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 28
          moveTo(x = 2.0f, y = 28.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
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
      .also { _convertToCloud = it }
  }

@Suppress("ObjectPropertyName")
private var _convertToCloud: ImageVector? = null
