// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Export: ImageVector
  get() {
    val current = _export
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Export",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 24 v4 H6 v-4 H4 v4 a2 2 0 0 0 2 2 h20 a2 2 0 0 0 2 -2 v-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 24
          moveTo(x = 26.0f, y = 24.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
        }
        // <polygon points="6.0 12.0 7.411 13.405 15.0 5.825 15.0 24.0 17.0 24.0 17.0 5.825 24.591 13.405 26.0 12.0 16.0 2.0 6.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 12
          moveTo(x = 6.0f, y = 12.0f)
          // L 7.411 13.405
          lineTo(x = 7.411f, y = 13.405f)
          // L 15 5.825
          lineTo(x = 15.0f, y = 5.825f)
          // L 15 24
          lineTo(x = 15.0f, y = 24.0f)
          // L 17 24
          lineTo(x = 17.0f, y = 24.0f)
          // L 17 5.825
          lineTo(x = 17.0f, y = 5.825f)
          // L 24.591 13.405
          lineTo(x = 24.591f, y = 13.405f)
          // L 26 12
          lineTo(x = 26.0f, y = 12.0f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 6 12z
          lineTo(x = 6.0f, y = 12.0f)
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
      .also { _export = it }
  }

@Suppress("ObjectPropertyName")
private var _export: ImageVector? = null
