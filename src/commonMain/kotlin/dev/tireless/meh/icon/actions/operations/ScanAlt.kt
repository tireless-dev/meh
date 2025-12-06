// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScanAlt: ImageVector
  get() {
    val current = _scanAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ScanAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 24 H10 a2 2 0 0 1 -2 -2 v-3 h2 v3 h12 v-3 h2 v3 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 24
          moveTo(x = 22.0f, y = 24.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
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
        // <rect width="28" height="2" x="2.0" y="15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 15
          moveTo(x = 2.0f, y = 15.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M24 13 h-2 v-3 H10 v3 H8 v-3 a2 2 0 0 1 2 -2 h12 a2 2 0 0 1 2 2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 13
          moveTo(x = 24.0f, y = 13.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 2 2 0 0 1 2 2z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          close()
        }
        // <polygon points="30.0 10.0 28.0 10.0 28.0 4.0 22.0 4.0 22.0 2.0 30.0 2.0 30.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 10
          moveTo(x = 30.0f, y = 10.0f)
          // L 28 10
          lineTo(x = 28.0f, y = 10.0f)
          // L 28 4
          lineTo(x = 28.0f, y = 4.0f)
          // L 22 4
          lineTo(x = 22.0f, y = 4.0f)
          // L 22 2
          lineTo(x = 22.0f, y = 2.0f)
          // L 30 2
          lineTo(x = 30.0f, y = 2.0f)
          // L 30 10z
          lineTo(x = 30.0f, y = 10.0f)
          close()
        }
        // <polygon points="4.0 10.0 2.0 10.0 2.0 2.0 10.0 2.0 10.0 4.0 4.0 4.0 4.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // L 2 10
          lineTo(x = 2.0f, y = 10.0f)
          // L 2 2
          lineTo(x = 2.0f, y = 2.0f)
          // L 10 2
          lineTo(x = 10.0f, y = 2.0f)
          // L 10 4
          lineTo(x = 10.0f, y = 4.0f)
          // L 4 4
          lineTo(x = 4.0f, y = 4.0f)
          // L 4 10z
          lineTo(x = 4.0f, y = 10.0f)
          close()
        }
        // <polygon points="10.0 30.0 2.0 30.0 2.0 22.0 4.0 22.0 4.0 28.0 10.0 28.0 10.0 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 30
          moveTo(x = 10.0f, y = 30.0f)
          // L 2 30
          lineTo(x = 2.0f, y = 30.0f)
          // L 2 22
          lineTo(x = 2.0f, y = 22.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 4 28
          lineTo(x = 4.0f, y = 28.0f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 10 30z
          lineTo(x = 10.0f, y = 30.0f)
          close()
        }
        // <polygon points="30.0 30.0 22.0 30.0 22.0 28.0 28.0 28.0 28.0 22.0 30.0 22.0 30.0 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 30
          moveTo(x = 30.0f, y = 30.0f)
          // L 22 30
          lineTo(x = 22.0f, y = 30.0f)
          // L 22 28
          lineTo(x = 22.0f, y = 28.0f)
          // L 28 28
          lineTo(x = 28.0f, y = 28.0f)
          // L 28 22
          lineTo(x = 28.0f, y = 22.0f)
          // L 30 22
          lineTo(x = 30.0f, y = 22.0f)
          // L 30 30z
          lineTo(x = 30.0f, y = 30.0f)
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
      .also { _scanAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _scanAlt: ImageVector? = null
