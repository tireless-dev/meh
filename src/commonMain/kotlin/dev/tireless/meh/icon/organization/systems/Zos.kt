// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Zos: ImageVector
  get() {
    val current = _zos
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Zos",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 22 h-5 v-2 h5 v-3 h-3 a2 2 0 0 1 -2 -2 v-3 a2 2 0 0 1 2 -2 h5 v2 h-5 v3 h3 a2 2 0 0 1 2 2 v3 a2 2 0 0 1 -2 2 m-9 0 h-3 a2 2 0 0 1 -2 -2 v-8 a2 2 0 0 1 2 -2 h3 a2 2 0 0 1 2 2 v8 a2 2 0 0 1 -2 2 m-3 -10 v8 h3 v-8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 22
          moveTo(x = 30.0f, y = 22.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
          // m -9 0
          moveToRelative(dx = -9.0f, dy = 0.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
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
          // m -3 -10
          moveToRelative(dx = -3.0f, dy = -10.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
        }
        // <polygon points="11.9458 10.0 7.9458 22.0 10.0542 22.0 14.0542 10.0 11.9458 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.9458 10
          moveTo(x = 11.9458f, y = 10.0f)
          // L 7.9458 22
          lineTo(x = 7.9458f, y = 22.0f)
          // L 10.0542 22
          lineTo(x = 10.0542f, y = 22.0f)
          // L 14.0542 10
          lineTo(x = 14.0542f, y = 10.0f)
          // L 11.9458 10z
          lineTo(x = 11.9458f, y = 10.0f)
          close()
        }
        // <polygon points="6.0 22.0 0.0 22.0 0.0 19.6973 3.7981 14.0 0.0 14.0 0.0 12.0 6.0 12.0 6.0 14.3027 2.2019 20.0 6.0 20.0 6.0 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 22
          moveTo(x = 6.0f, y = 22.0f)
          // L 0 22
          lineTo(x = 0.0f, y = 22.0f)
          // L 0 19.6973
          lineTo(x = 0.0f, y = 19.6973f)
          // L 3.7981 14
          lineTo(x = 3.7981f, y = 14.0f)
          // L 0 14
          lineTo(x = 0.0f, y = 14.0f)
          // L 0 12
          lineTo(x = 0.0f, y = 12.0f)
          // L 6 12
          lineTo(x = 6.0f, y = 12.0f)
          // L 6 14.3027
          lineTo(x = 6.0f, y = 14.3027f)
          // L 2.2019 20
          lineTo(x = 2.2019f, y = 20.0f)
          // L 6 20
          lineTo(x = 6.0f, y = 20.0f)
          // L 6 22z
          lineTo(x = 6.0f, y = 22.0f)
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
      .also { _zos = it }
  }

@Suppress("ObjectPropertyName")
private var _zos: ImageVector? = null
