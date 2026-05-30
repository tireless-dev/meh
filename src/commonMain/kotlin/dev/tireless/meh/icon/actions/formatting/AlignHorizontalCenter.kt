// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlignHorizontalCenter: ImageVector
  get() {
    val current = _alignHorizontalCenter
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AlignHorizontalCenter",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 18 h-7 v-4 h3 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 h-3 V2 h-2 v4 h-3 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h3 v4 H8 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h7 v4 h2 v-4 h7 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 M12 8 h8 v4 h-8Z m12 16 H8 v-4 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 18
          moveTo(x = 24.0f, y = 18.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
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
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // m 12 16
          moveToRelative(dx = 12.0f, dy = 16.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
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
      .also { _alignHorizontalCenter = it }
  }

@Suppress("ObjectPropertyName")
private var _alignHorizontalCenter: ImageVector? = null
