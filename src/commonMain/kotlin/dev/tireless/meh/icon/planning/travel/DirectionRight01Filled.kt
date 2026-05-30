// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionRight01Filled: ImageVector
  get() {
    val current = _directionRight01Filled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionRight01Filled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m-9 16 -1.41 -1.41 L22.17 12 H10 v14 H8 V12 a2 2 0 0 1 2 -2 h12.17 L17.6 5.41 19 4 l7 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -9 16
          moveToRelative(dx = -9.0f, dy = 16.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 22.17 12
          lineTo(x = 22.17f, y = 12.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 12.17
          horizontalLineToRelative(dx = 12.17f)
          // L 17.6 5.41
          lineTo(x = 17.6f, y = 5.41f)
          // L 19 4
          lineTo(x = 19.0f, y = 4.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // m19 18 -1.41 -1.41 L22.17 12 H10 v14 H8 V12 a2 2 0 0 1 2 -2 h12.17 L17.6 5.41 19 4 l7 7Z
        path {
          // M 19 18
          moveTo(x = 19.0f, y = 18.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 22.17 12
          lineTo(x = 22.17f, y = 12.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 12.17
          horizontalLineToRelative(dx = 12.17f)
          // L 17.6 5.41
          lineTo(x = 17.6f, y = 5.41f)
          // L 19 4
          lineTo(x = 19.0f, y = 4.0f)
          // l 7 7z
          lineToRelative(dx = 7.0f, dy = 7.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _directionRight01Filled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionRight01Filled: ImageVector? = null
