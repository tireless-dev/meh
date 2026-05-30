// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HardwareSecurityModule: ImageVector
  get() {
    val current = _hardwareSecurityModule
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HardwareSecurityModule",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="21.5" cy="7.5" radius="1.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21.5 7.5
          moveTo(x = 21.5f, y = 7.5f)
          // m -1.5 0
          moveToRelative(dx = -1.5f, dy = 0.0f)
          // a 1.5 1.5 0 1 1 3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 1 1 -3 0z
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M14.41 20 H9 v-5.41 l6.03 -6.03 L15 8 a6 6 0 1 1 6 6 l-.56 -.03Z M11 18 h2.59 l6.17 -6.17 .51 .1 A4 4 0 0 0 21 12 a4.05 4.05 0 1 0 -3.92 -3.27 l.09 .51 L11 15.41Z m17 2 h-9 v2 h9 v6 H4 v-6 h2 v-2 H4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14.41 20
          moveTo(x = 14.41f, y = 20.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -5.41
          verticalLineToRelative(dy = -5.41f)
          // l 6.03 -6.03
          lineToRelative(dx = 6.03f, dy = -6.03f)
          // L 15 8
          lineTo(x = 15.0f, y = 8.0f)
          // a 6 6 0 1 1 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // l -0.56 -0.03z
          lineToRelative(dx = -0.56f, dy = -0.03f)
          close()
          // M 11 18
          moveTo(x = 11.0f, y = 18.0f)
          // h 2.59
          horizontalLineToRelative(dx = 2.59f)
          // l 6.17 -6.17
          lineToRelative(dx = 6.17f, dy = -6.17f)
          // l 0.51 0.1
          lineToRelative(dx = 0.51f, dy = 0.1f)
          // A 4 4 0 0 0 21 12
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 12.0f,
          )
          // a 4.05 4.05 0 1 0 -3.92 -3.27
          arcToRelative(
            a = 4.05f,
            b = 4.05f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -3.92f,
            dy1 = -3.27f,
          )
          // l 0.09 0.51
          lineToRelative(dx = 0.09f, dy = 0.51f)
          // L 11 15.41z
          lineTo(x = 11.0f, y = 15.41f)
          close()
          // m 17 2
          moveToRelative(dx = 17.0f, dy = 2.0f)
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
        }
        // <circle cx="7.0" cy="25.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 25
          moveTo(x = 7.0f, y = 25.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
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
      .also { _hardwareSecurityModule = it }
  }

@Suppress("ObjectPropertyName")
private var _hardwareSecurityModule: ImageVector? = null
