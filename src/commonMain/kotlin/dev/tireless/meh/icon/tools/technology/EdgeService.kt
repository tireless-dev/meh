// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EdgeService: ImageVector
  get() {
    val current = _edgeService
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.EdgeService",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="10" x="7.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="11.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 11
          moveTo(x = 11.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="15.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 11
          moveTo(x = 15.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="19.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 19 11
          moveTo(x = 19.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="23.0" y="11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 11
          moveTo(x = 23.0f, y = 11.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M28 26 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2 M4 8 v16 h24 V8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 26
          moveTo(x = 28.0f, y = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
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
      .also { _edgeService = it }
  }

@Suppress("ObjectPropertyName")
private var _edgeService: ImageVector? = null
