// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Chart3D: ImageVector
  get() {
    val current = _chart3D
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Chart3D",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 23 v3.59 l-5 -5 V15 a1 1 0 0 0 -.55 -.9 L17 11.39 V5.83 l2.59 2.58 L21 7 l-5 -5 -5 5 1.41 1.41 L15 5.83 v5.55 l-5.45 2.73 A1 1 0 0 0 9 15 v6.59 l-5 5 V23 H2 v7 h7 v-2 H5.41 l4.79 -4.78 5.35 2.67 a1 1 0 0 0 .9 0 l5.35 -2.67 L26.6 28 H23 v2 h7 v-7Z m-13 .38 -4 -2 v-4.76 l4 2Z m1 -6.5 L12.24 15 16 13.12 19.76 15Z m5 4.5 -4 2 v-4.76 l4 -2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 23
          moveTo(x = 28.0f, y = 23.0f)
          // v 3.59
          verticalLineToRelative(dy = 3.59f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // V 15
          verticalLineTo(y = 15.0f)
          // a 1 1 0 0 0 -0.55 -0.9
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.55f,
            dy1 = -0.9f,
          )
          // L 17 11.39
          lineTo(x = 17.0f, y = 11.39f)
          // V 5.83
          verticalLineTo(y = 5.83f)
          // l 2.59 2.58
          lineToRelative(dx = 2.59f, dy = 2.58f)
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 15 5.83
          lineTo(x = 15.0f, y = 5.83f)
          // v 5.55
          verticalLineToRelative(dy = 5.55f)
          // l -5.45 2.73
          lineToRelative(dx = -5.45f, dy = 2.73f)
          // A 1 1 0 0 0 9 15
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.0f,
            y1 = 15.0f,
          )
          // v 6.59
          verticalLineToRelative(dy = 6.59f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // V 23
          verticalLineTo(y = 23.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5.41
          horizontalLineTo(x = 5.41f)
          // l 4.79 -4.78
          lineToRelative(dx = 4.79f, dy = -4.78f)
          // l 5.35 2.67
          lineToRelative(dx = 5.35f, dy = 2.67f)
          // a 1 1 0 0 0 0.9 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.9f,
            dy1 = 0.0f,
          )
          // l 5.35 -2.67
          lineToRelative(dx = 5.35f, dy = -2.67f)
          // L 26.6 28
          lineTo(x = 26.6f, y = 28.0f)
          // H 23
          horizontalLineTo(x = 23.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -7z
          verticalLineToRelative(dy = -7.0f)
          close()
          // m -13 0.38
          moveToRelative(dx = -13.0f, dy = 0.38f)
          // l -4 -2
          lineToRelative(dx = -4.0f, dy = -2.0f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 2z
          lineToRelative(dx = 4.0f, dy = 2.0f)
          close()
          // m 1 -6.5
          moveToRelative(dx = 1.0f, dy = -6.5f)
          // L 12.24 15
          lineTo(x = 12.24f, y = 15.0f)
          // L 16 13.12
          lineTo(x = 16.0f, y = 13.12f)
          // L 19.76 15z
          lineTo(x = 19.76f, y = 15.0f)
          close()
          // m 5 4.5
          moveToRelative(dx = 5.0f, dy = 4.5f)
          // l -4 2
          lineToRelative(dx = -4.0f, dy = 2.0f)
          // v -4.76
          verticalLineToRelative(dy = -4.76f)
          // l 4 -2z
          lineToRelative(dx = 4.0f, dy = -2.0f)
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
      .also { _chart3D = it }
  }

@Suppress("ObjectPropertyName")
private var _chart3D: ImageVector? = null
