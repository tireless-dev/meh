// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RotateClockwiseAltFilled: ImageVector
  get() {
    val current = _rotateClockwiseAltFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RotateClockwiseAltFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 H4 a2 2 0 0 1 -2 -2 V16 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2 m14 -15 -1.41 -1.41 L26 16.17 V11 a7 7 0 0 0 -7 -7 h-5 v2 h5 a5 5 0 0 1 5 5 v5.17 l-2.59 -2.58 L20 15 l5 5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 14 -15
          moveToRelative(dx = 14.0f, dy = -15.0f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // L 26 16.17
          lineTo(x = 26.0f, y = 16.17f)
          // V 11
          verticalLineTo(y = 11.0f)
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 5 5 0 0 1 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // v 5.17
          verticalLineToRelative(dy = 5.17f)
          // l -2.59 -2.58
          lineToRelative(dx = -2.59f, dy = -2.58f)
          // L 20 15
          lineTo(x = 20.0f, y = 15.0f)
          // l 5 5z
          lineToRelative(dx = 5.0f, dy = 5.0f)
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
      .also { _rotateClockwiseAltFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _rotateClockwiseAltFilled: ImageVector? = null
