// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tablet: ImageVector
  get() {
    val current = _tablet
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Tablet",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="6" x="15.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 24
          moveTo(x = 19.0f, y = 24.0f)
          // l -8.742278E-8 2
          lineToRelative(dx = -8.742278E-8f, dy = 2.0f)
          // l -6 -2.6226832E-7
          lineToRelative(dx = -6.0f, dy = -2.6226832E-7f)
          // l 8.742278E-8 -2z
          lineToRelative(dx = 8.742278E-8f, dy = -2.0f)
          close()
        }
        // M25 30 H7 a2 2 0 0 1 -2 -2 V4 a2 2 0 0 1 2 -2 h18 a2 2 0 0 1 2 2 v24 a2 2 0 0 1 -2 2 M7 4 v24 h18 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 30
          moveTo(x = 25.0f, y = 30.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // M 7 4
          moveTo(x = 7.0f, y = 4.0f)
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
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
      .also { _tablet = it }
  }

@Suppress("ObjectPropertyName")
private var _tablet: ImageVector? = null
