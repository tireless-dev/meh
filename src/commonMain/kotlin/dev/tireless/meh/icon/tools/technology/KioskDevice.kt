// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KioskDevice: ImageVector
  get() {
    val current = _kioskDevice
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.KioskDevice",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 19 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H6 a2 2 0 0 0 -2 2 v13 a2 2 0 0 0 2 2 h7 v9 H4 v2 h24 v-2 h-9 v-9z m-9 9 h-2 v-9 h2z M6 17 V4 h20 v13z m10 -4 c-.55 0 -1 .45 -1 1 s.45 1 1 1 1 -.45 1 -1 -.45 -1 -1 -1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 19
          moveTo(x = 26.0f, y = 19.0f)
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
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
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
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v -9z
          verticalLineToRelative(dy = -9.0f)
          close()
          // m -9 9
          moveToRelative(dx = -9.0f, dy = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // M 6 17
          moveTo(x = 6.0f, y = 17.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 13z
          verticalLineToRelative(dy = 13.0f)
          close()
          // m 10 -4
          moveToRelative(dx = 10.0f, dy = -4.0f)
          // c -0.55 0 -1 0.45 -1 1
          curveToRelative(
            dx1 = -0.55f,
            dy1 = 0.0f,
            dx2 = -1.0f,
            dy2 = 0.45f,
            dx3 = -1.0f,
            dy3 = 1.0f,
          )
          // s 0.45 1 1 1
          reflectiveCurveToRelative(
            dx1 = 0.45f,
            dy1 = 1.0f,
            dx2 = 1.0f,
            dy2 = 1.0f,
          )
          // s 1 -0.45 1 -1
          reflectiveCurveToRelative(
            dx1 = 1.0f,
            dy1 = -0.45f,
            dx2 = 1.0f,
            dy2 = -1.0f,
          )
          // s -0.45 -1 -1 -1
          reflectiveCurveToRelative(
            dx1 = -0.45f,
            dy1 = -1.0f,
            dx2 = -1.0f,
            dy2 = -1.0f,
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
      .also { _kioskDevice = it }
  }

@Suppress("ObjectPropertyName")
private var _kioskDevice: ImageVector? = null
