// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TSV: ImageVector
  get() {
    val current = _tSV
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TSV",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.0 9.0 26.0 22.0 24.0 9.0 22.0 9.0 24.516 23.0 27.484 23.0 30.0 9.0 28.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 9
          moveTo(x = 28.0f, y = 9.0f)
          // L 26 22
          lineTo(x = 26.0f, y = 22.0f)
          // L 24 9
          lineTo(x = 24.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 24.516 23
          lineTo(x = 24.516f, y = 23.0f)
          // L 27.484 23
          lineTo(x = 27.484f, y = 23.0f)
          // L 30 9
          lineTo(x = 30.0f, y = 9.0f)
          // L 28 9z
          lineTo(x = 28.0f, y = 9.0f)
          close()
        }
        // M18 23 h-6 v-2 h6 v-4 h-4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h6 v2 h-6 v4 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 23
          moveTo(x = 18.0f, y = 23.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
        }
        // <polygon points="2.0 11.0 5.0 11.0 5.0 23.0 7.0 23.0 7.0 11.0 10.0 11.0 10.0 9.0 2.0 9.0 2.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 11
          moveTo(x = 2.0f, y = 11.0f)
          // L 5 11
          lineTo(x = 5.0f, y = 11.0f)
          // L 5 23
          lineTo(x = 5.0f, y = 23.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 7 11
          lineTo(x = 7.0f, y = 11.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 10 9
          lineTo(x = 10.0f, y = 9.0f)
          // L 2 9
          lineTo(x = 2.0f, y = 9.0f)
          // L 2 11z
          lineTo(x = 2.0f, y = 11.0f)
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
      .also { _tSV = it }
  }

@Suppress("ObjectPropertyName")
private var _tSV: ImageVector? = null
