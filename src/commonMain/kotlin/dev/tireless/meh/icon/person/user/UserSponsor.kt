// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserSponsor: ImageVector
  get() {
    val current = _userSponsor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserSponsor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="31.8301 13.3662 30.8301 11.6338 28.0 13.2681 28.0 10.0 26.0 10.0 26.0 13.2676 23.1699 11.6338 22.1699 13.3662 25.0 15.0 22.1699 16.6338 23.1699 18.3662 26.0 16.7324 26.0 20.0 28.0 20.0 28.0 16.7319 30.8301 18.3662 31.8301 16.6338 29.0 15.0 31.8301 13.3662" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 31.8301 13.3662
          moveTo(x = 31.8301f, y = 13.3662f)
          // L 30.8301 11.6338
          lineTo(x = 30.8301f, y = 11.6338f)
          // L 28 13.2681
          lineTo(x = 28.0f, y = 13.2681f)
          // L 28 10
          lineTo(x = 28.0f, y = 10.0f)
          // L 26 10
          lineTo(x = 26.0f, y = 10.0f)
          // L 26 13.2676
          lineTo(x = 26.0f, y = 13.2676f)
          // L 23.1699 11.6338
          lineTo(x = 23.1699f, y = 11.6338f)
          // L 22.1699 13.3662
          lineTo(x = 22.1699f, y = 13.3662f)
          // L 25 15
          lineTo(x = 25.0f, y = 15.0f)
          // L 22.1699 16.6338
          lineTo(x = 22.1699f, y = 16.6338f)
          // L 23.1699 18.3662
          lineTo(x = 23.1699f, y = 18.3662f)
          // L 26 16.7324
          lineTo(x = 26.0f, y = 16.7324f)
          // L 26 20
          lineTo(x = 26.0f, y = 20.0f)
          // L 28 20
          lineTo(x = 28.0f, y = 20.0f)
          // L 28 16.7319
          lineTo(x = 28.0f, y = 16.7319f)
          // L 30.8301 18.3662
          lineTo(x = 30.8301f, y = 18.3662f)
          // L 31.8301 16.6338
          lineTo(x = 31.8301f, y = 16.6338f)
          // L 29 15
          lineTo(x = 29.0f, y = 15.0f)
          // L 31.8301 13.3662z
          lineTo(x = 31.8301f, y = 13.3662f)
          close()
        }
        // M22 30 h-2 v-5 a5 5 0 0 0 -5 -5 H9 a5 5 0 0 0 -5 5 v5 H2 v-5 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 7 7z M12 4 a5 5 0 1 1 0 10 5 5 0 0 1 0 -10 m0 -2 a7 7 0 1 0 0 14 7 7 0 0 0 0 -14
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 30
          moveTo(x = 22.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 7 7 0 0 1 7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = -7.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 7 7 0 0 1 7 7z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          close()
          // M 12 4
          moveTo(x = 12.0f, y = 4.0f)
          // a 5 5 0 1 1 0 10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 10.0f,
          )
          // a 5 5 0 0 1 0 -10
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -10.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 7 7 0 1 0 0 14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 14.0f,
          )
          // a 7 7 0 0 0 0 -14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -14.0f,
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
      .also { _userSponsor = it }
  }

@Suppress("ObjectPropertyName")
private var _userSponsor: ImageVector? = null
