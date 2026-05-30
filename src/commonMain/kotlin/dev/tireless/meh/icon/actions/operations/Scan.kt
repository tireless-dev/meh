// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Scan: ImageVector
  get() {
    val current = _scan
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Scan",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 29 H5 a2 2 0 0 1 -2 -2 V5 a2 2 0 0 1 2 -2 h16 v2 H5 v22 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 29
          moveTo(x = 21.0f, y = 29.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // V 5
          verticalLineTo(y = 5.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
        }
        // <rect width="2" height="14" x="15.0" y="9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 9
          moveTo(x = 15.0f, y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="14" x="27.0" y="9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 9
          moveTo(x = 27.0f, y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="14" x="21.0" y="9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 9
          moveTo(x = 21.0f, y = 9.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
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
      .also { _scan = it }
  }

@Suppress("ObjectPropertyName")
private var _scan: ImageVector? = null
