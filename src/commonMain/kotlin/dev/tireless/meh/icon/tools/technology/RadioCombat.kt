// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RadioCombat: ImageVector
  get() {
    val current = _radioCombat
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RadioCombat",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M10 26 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 26
          moveTo(x = 10.0f, y = 26.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
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
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        }
        // <rect width="9" height="2" x="17.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 20
          moveTo(x = 17.0f, y = 20.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
          close()
        }
        // <rect width="9" height="2" x="17.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 24
          moveTo(x = 17.0f, y = 24.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
          close()
        }
        // M20 12 h8 a2 2 0 0 0 2 -2 V6 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 h-6 a4 4 0 0 0 -4 4 v3 H6 V4 H4 v10 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V16 a2 2 0 0 0 -2 -2 H10 v-3 a2 2 0 0 1 2 -2 h6 v1 a2 2 0 0 0 2 2 m4 -6 h4 v4 h-4Z m-4 0 h2 v4 h-2Z m8 22 H4 V16 h24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 12
          moveTo(x = 20.0f, y = 12.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h -8
          horizontalLineToRelative(dx = -8.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 4 4 0 0 0 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // V 16
          verticalLineTo(y = 16.0f)
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
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // m 4 -6
          moveToRelative(dx = 4.0f, dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m -4 0
          moveToRelative(dx = -4.0f, dy = 0.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 8 22
          moveToRelative(dx = 8.0f, dy = 22.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
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
      .also { _radioCombat = it }
  }

@Suppress("ObjectPropertyName")
private var _radioCombat: ImageVector? = null
