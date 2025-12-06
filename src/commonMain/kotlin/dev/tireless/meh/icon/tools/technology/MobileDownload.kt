// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileDownload: ImageVector
  get() {
    val current = _mobileDownload
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MobileDownload",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.0 25.0 26.586 23.586 24.0 26.172 24.0 18.0 22.0 18.0 22.0 26.172 19.414 23.586 18.0 25.0 23.0 30.0 28.0 25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 25
          moveTo(x = 28.0f, y = 25.0f)
          // L 26.586 23.586
          lineTo(x = 26.586f, y = 23.586f)
          // L 24 26.172
          lineTo(x = 24.0f, y = 26.172f)
          // L 24 18
          lineTo(x = 24.0f, y = 18.0f)
          // L 22 18
          lineTo(x = 22.0f, y = 18.0f)
          // L 22 26.172
          lineTo(x = 22.0f, y = 26.172f)
          // L 19.414 23.586
          lineTo(x = 19.414f, y = 23.586f)
          // L 18 25
          lineTo(x = 18.0f, y = 25.0f)
          // L 23 30
          lineTo(x = 23.0f, y = 30.0f)
          // L 28 25z
          lineTo(x = 28.0f, y = 25.0f)
          close()
        }
        // M10 28 V10 h12 v5 h2 V6 a2 2 0 0 0 -2 -2 H10 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h6 v-2Z m0 -22 h12 v2 H10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 28
          moveTo(x = 10.0f, y = 28.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m 0 -22
          moveToRelative(dx = 0.0f, dy = -22.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 10z
          horizontalLineTo(x = 10.0f)
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
      .also { _mobileDownload = it }
  }

@Suppress("ObjectPropertyName")
private var _mobileDownload: ImageVector? = null
