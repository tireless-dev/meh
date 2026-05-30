// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ServiceDesk: ImageVector
  get() {
    val current = _serviceDesk
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ServiceDesk",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 24 v-2 a12 12 0 0 0 -11 -11.94 V8 h3 V6 h-8 v2 h3 v2.05 A12 12 0 0 0 4 22 v2 H2 v2 h28 v-2Z M16 12 a10 10 0 0 1 9.8 8 H6.2 a10 10 0 0 1 9.8 -8 M6 22 h20 v2 H6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 24
          moveTo(x = 28.0f, y = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 12 12 0 0 0 -11 -11.94
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -11.0f,
            dy1 = -11.94f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2.05
          verticalLineToRelative(dy = 2.05f)
          // A 12 12 0 0 0 4 22
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 22.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // M 16 12
          moveTo(x = 16.0f, y = 12.0f)
          // a 10 10 0 0 1 9.8 8
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.8f,
            dy1 = 8.0f,
          )
          // H 6.2
          horizontalLineTo(x = 6.2f)
          // a 10 10 0 0 1 9.8 -8
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 9.8f,
            dy1 = -8.0f,
          )
          // M 6 22
          moveTo(x = 6.0f, y = 22.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
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
      .also { _serviceDesk = it }
  }

@Suppress("ObjectPropertyName")
private var _serviceDesk: ImageVector? = null
