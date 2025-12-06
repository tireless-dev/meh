// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShrinkScreen: ImageVector
  get() {
    val current = _shrinkScreen
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ShrinkScreen",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 28 H17 a2 2 0 0 1 -2 -2 v-6 a2 2 0 0 1 2 -2 h11 a2 2 0 0 1 2 2 v6 a2 2 0 0 1 -2 2 m-11 -8 v6 h11 v-6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 28
          moveTo(x = 28.0f, y = 28.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h 11
          horizontalLineToRelative(dx = 11.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // m -11 -8
          moveToRelative(dx = -11.0f, dy = -8.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 11
          horizontalLineToRelative(dx = 11.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
        }
        // <polygon points="12.0 10.0 12.0 13.586 7.707 9.293 6.293 10.707 10.586 15.0 7.0 15.0 7.0 17.0 14.0 17.0 14.0 10.0 12.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 10
          moveTo(x = 12.0f, y = 10.0f)
          // L 12 13.586
          lineTo(x = 12.0f, y = 13.586f)
          // L 7.707 9.293
          lineTo(x = 7.707f, y = 9.293f)
          // L 6.293 10.707
          lineTo(x = 6.293f, y = 10.707f)
          // L 10.586 15
          lineTo(x = 10.586f, y = 15.0f)
          // L 7 15
          lineTo(x = 7.0f, y = 15.0f)
          // L 7 17
          lineTo(x = 7.0f, y = 17.0f)
          // L 14 17
          lineTo(x = 14.0f, y = 17.0f)
          // L 14 10
          lineTo(x = 14.0f, y = 10.0f)
          // L 12 10z
          lineTo(x = 12.0f, y = 10.0f)
          close()
        }
        // M13 22 H4 a2 2 0 0 1 -2 -2 V7 a2 2 0 0 1 2 -2 h22 a2 2 0 0 1 2 2 v9 h-2 V7 H4 v13 h9Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 22
          moveTo(x = 13.0f, y = 22.0f)
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
          // V 7
          verticalLineTo(y = 7.0f)
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
          // h 22
          horizontalLineToRelative(dx = 22.0f)
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
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // h 9z
          horizontalLineToRelative(dx = 9.0f)
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
      .also { _shrinkScreen = it }
  }

@Suppress("ObjectPropertyName")
private var _shrinkScreen: ImageVector? = null
