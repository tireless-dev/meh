// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalculationAlt: ImageVector
  get() {
    val current = _calculationAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CalculationAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="6" height="2" x="19.0" y="13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 13
          moveTo(x = 19.0f, y = 13.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <polygon points="13.0 21.0 11.0 21.0 11.0 19.0 9.0 19.0 9.0 21.0 7.0 21.0 7.0 23.0 9.0 23.0 9.0 25.0 11.0 25.0 11.0 23.0 13.0 23.0 13.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 21
          moveTo(x = 13.0f, y = 21.0f)
          // L 11 21
          lineTo(x = 11.0f, y = 21.0f)
          // L 11 19
          lineTo(x = 11.0f, y = 19.0f)
          // L 9 19
          lineTo(x = 9.0f, y = 19.0f)
          // L 9 21
          lineTo(x = 9.0f, y = 21.0f)
          // L 7 21
          lineTo(x = 7.0f, y = 21.0f)
          // L 7 23
          lineTo(x = 7.0f, y = 23.0f)
          // L 9 23
          lineTo(x = 9.0f, y = 23.0f)
          // L 9 25
          lineTo(x = 9.0f, y = 25.0f)
          // L 11 25
          lineTo(x = 11.0f, y = 25.0f)
          // L 11 23
          lineTo(x = 11.0f, y = 23.0f)
          // L 13 23
          lineTo(x = 13.0f, y = 23.0f)
          // L 13 21z
          lineTo(x = 13.0f, y = 21.0f)
          close()
        }
        // <rect width="6" height="2" x="7.0" y="9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 9
          moveTo(x = 7.0f, y = 9.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="6" height="2" x="19.0" y="17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 17
          moveTo(x = 19.0f, y = 17.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // M27 3 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h22 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 M15 5 v10 H5 V5Z M5 17 h10 v10 H5Z m12 10 V5 h10 v22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 3
          moveTo(x = 27.0f, y = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
          // h 22
          horizontalLineToRelative(dx = 22.0f)
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
          // V 5
          verticalLineTo(y = 5.0f)
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
          // M 15 5
          moveTo(x = 15.0f, y = 5.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5z
          verticalLineTo(y = 5.0f)
          close()
          // M 5 17
          moveTo(x = 5.0f, y = 17.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 12 10
          moveToRelative(dx = 12.0f, dy = 10.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 22z
          verticalLineToRelative(dy = 22.0f)
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
      .also { _calculationAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _calculationAlt: ImageVector? = null
