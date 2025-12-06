// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CicsRegionAlt: ImageVector
  get() {
    val current = _cicsRegionAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CicsRegionAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M31 13 v-2 h-4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h2 v2 h-4 v2 h4 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 -2 -2 h-2 v-2z m-14 0 v6 a2 2 0 0 0 2 2 h4 v-2 h-4 v-6 h4 v-2 h-4 a2 2 0 0 0 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31 13
          moveTo(x = 31.0f, y = 13.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -14 0
          moveToRelative(dx = -14.0f, dy = 0.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
        }
        // <polygon points="9.0 13.0 11.0 13.0 11.0 19.0 9.0 19.0 9.0 21.0 15.0 21.0 15.0 19.0 13.0 19.0 13.0 13.0 15.0 13.0 15.0 11.0 9.0 11.0 9.0 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 13
          moveTo(x = 9.0f, y = 13.0f)
          // L 11 13
          lineTo(x = 11.0f, y = 13.0f)
          // L 11 19
          lineTo(x = 11.0f, y = 19.0f)
          // L 9 19
          lineTo(x = 9.0f, y = 19.0f)
          // L 9 21
          lineTo(x = 9.0f, y = 21.0f)
          // L 15 21
          lineTo(x = 15.0f, y = 21.0f)
          // L 15 19
          lineTo(x = 15.0f, y = 19.0f)
          // L 13 19
          lineTo(x = 13.0f, y = 19.0f)
          // L 13 13
          lineTo(x = 13.0f, y = 13.0f)
          // L 15 13
          lineTo(x = 15.0f, y = 13.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 9 11
          lineTo(x = 9.0f, y = 11.0f)
          // L 9 13z
          lineTo(x = 9.0f, y = 13.0f)
          close()
        }
        // M1 13 v6 a2 2 0 0 0 2 2 h4 v-2 H3 v-6 h4 v-2 H3 a2 2 0 0 0 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 1 13
          moveTo(x = 1.0f, y = 13.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 3
          horizontalLineTo(x = 3.0f)
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
      .also { _cicsRegionAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _cicsRegionAlt: ImageVector? = null
