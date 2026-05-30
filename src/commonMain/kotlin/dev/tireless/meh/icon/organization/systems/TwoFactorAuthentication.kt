// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TwoFactorAuthentication: ImageVector
  get() {
    val current = _twoFactorAuthentication
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TwoFactorAuthentication",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="11.0 23.18 9.0 21.179 7.589 22.589 11.0 26.0 17.0 20.0 15.59 18.59 11.0 23.18" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 23.18
          moveTo(x = 11.0f, y = 23.18f)
          // L 9 21.179
          lineTo(x = 9.0f, y = 21.179f)
          // L 7.589 22.589
          lineTo(x = 7.589f, y = 22.589f)
          // L 11 26
          lineTo(x = 11.0f, y = 26.0f)
          // L 17 20
          lineTo(x = 17.0f, y = 20.0f)
          // L 15.59 18.59
          lineTo(x = 15.59f, y = 18.59f)
          // L 11 23.18z
          lineTo(x = 11.0f, y = 23.18f)
          close()
        }
        // M28 30 h-4 v-2 h4 V16 h-4 V8 a4 4 0 0 0 -4 -4 V2 a6 6 0 0 1 6 6 v6 h2 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 4 4 0 0 0 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // a 6 6 0 0 1 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
        // M20 14 h-2 V8 A6 6 0 0 0 6 8 v6 H4 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V16 a2 2 0 0 0 -2 -2 M8 8 a4 4 0 0 1 8 0 v6 H8Z m12 20 H4 V16 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 14
          moveTo(x = 20.0f, y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // A 6 6 0 0 0 6 8
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 8.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // M 8 8
          moveTo(x = 8.0f, y = 8.0f)
          // a 4 4 0 0 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 12 20
          moveToRelative(dx = 12.0f, dy = 20.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
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
      .also { _twoFactorAuthentication = it }
  }

@Suppress("ObjectPropertyName")
private var _twoFactorAuthentication: ImageVector? = null
