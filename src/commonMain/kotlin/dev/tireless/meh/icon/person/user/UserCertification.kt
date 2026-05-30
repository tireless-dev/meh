// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserCertification: ImageVector
  get() {
    val current = _userCertification
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserCertification",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 10.0 26.593 13.0 30.0 13.414 27.5 15.667 28.0 19.0 25.0 17.125 22.0 19.0 22.5 15.667 20.0 13.414 23.5 13.0 25.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 10
          moveTo(x = 25.0f, y = 10.0f)
          // L 26.593 13
          lineTo(x = 26.593f, y = 13.0f)
          // L 30 13.414
          lineTo(x = 30.0f, y = 13.414f)
          // L 27.5 15.667
          lineTo(x = 27.5f, y = 15.667f)
          // L 28 19
          lineTo(x = 28.0f, y = 19.0f)
          // L 25 17.125
          lineTo(x = 25.0f, y = 17.125f)
          // L 22 19
          lineTo(x = 22.0f, y = 19.0f)
          // L 22.5 15.667
          lineTo(x = 22.5f, y = 15.667f)
          // L 20 13.414
          lineTo(x = 20.0f, y = 13.414f)
          // L 23.5 13
          lineTo(x = 23.5f, y = 13.0f)
          // L 25 10z
          lineTo(x = 25.0f, y = 10.0f)
          close()
        }
        // M22 30 h-2 v-5 a5 5 0 0 0 -5 -5 H9 a5 5 0 0 0 -5 5 v5 H2 v-5 a7 7 0 0 1 7 -7 h6 a7 7 0 0 1 7 7Z M12 4 a5 5 0 1 1 -5 5 5 5 0 0 1 5 -5 m0 -2 a7 7 0 1 0 7 7 7 7 0 0 0 -7 -7
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
          // a 5 5 0 1 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 7 7 0 1 0 7 7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 7.0f,
          )
          // a 7 7 0 0 0 -7 -7
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.0f,
            dy1 = -7.0f,
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
      .also { _userCertification = it }
  }

@Suppress("ObjectPropertyName")
private var _userCertification: ImageVector? = null
