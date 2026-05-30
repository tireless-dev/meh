// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HDR: ImageVector
  get() {
    val current = _hDR
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HDR",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 15 v-4 a2 2 0 0 0 -2 -2 h-6 v14 h2 v-6 h1.48 l2.34 6 H30 l-2.33 -6 H28 a2 2 0 0 0 2 -2 m-6 -4 h4 v4 h-4Z m-8 12 h-4 V9 h4 a4 4 0 0 1 4 4 v6 a4 4 0 0 1 -4 4 m-2 -2 h2 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 h-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 15
          moveTo(x = 30.0f, y = 15.0f)
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
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 1.48
          horizontalLineToRelative(dx = 1.48f)
          // l 2.34 6
          lineToRelative(dx = 2.34f, dy = 6.0f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // l -2.33 -6
          lineToRelative(dx = -2.33f, dy = -6.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
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
          // m -6 -4
          moveToRelative(dx = -6.0f, dy = -4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -8 12
          moveToRelative(dx = -8.0f, dy = 12.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m -2 -2
          moveToRelative(dx = -2.0f, dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <polygon points="8.0 9.0 8.0 15.0 4.0 15.0 4.0 9.0 2.0 9.0 2.0 23.0 4.0 23.0 4.0 17.0 8.0 17.0 8.0 23.0 10.0 23.0 10.0 9.0 8.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // L 8 15
          lineTo(x = 8.0f, y = 15.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 4 9
          lineTo(x = 4.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 2 23
          lineTo(x = 2.0f, y = 23.0f)
          // L 4 23
          lineTo(x = 4.0f, y = 23.0f)
          // L 4 17
          lineTo(x = 4.0f, y = 17.0f)
          // L 8 17
          lineTo(x = 8.0f, y = 17.0f)
          // L 8 23
          lineTo(x = 8.0f, y = 23.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 8 9z
          lineTo(x = 8.0f, y = 9.0f)
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
      .also { _hDR = it }
  }

@Suppress("ObjectPropertyName")
private var _hDR: ImageVector? = null
