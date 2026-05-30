// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Db2BufferPool: ImageVector
  get() {
    val current = _db2BufferPool
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Db2BufferPool",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="26.338 31.0 24.602 30.0 26.8895 26.0 23.0 26.0 26.993 19.0 28.73 20.0 26.4463 24.0 30.3367 24.0 26.338 31.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.338 31
          moveTo(x = 26.338f, y = 31.0f)
          // L 24.602 30
          lineTo(x = 24.602f, y = 30.0f)
          // L 26.8895 26
          lineTo(x = 26.8895f, y = 26.0f)
          // L 23 26
          lineTo(x = 23.0f, y = 26.0f)
          // L 26.993 19
          lineTo(x = 26.993f, y = 19.0f)
          // L 28.73 20
          lineTo(x = 28.73f, y = 20.0f)
          // L 26.4463 24
          lineTo(x = 26.4463f, y = 24.0f)
          // L 30.3367 24
          lineTo(x = 30.3367f, y = 24.0f)
          // L 26.338 31z
          lineTo(x = 26.338f, y = 31.0f)
          close()
        }
        // <rect width="4" height="2" x="8.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="20.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 14
          moveTo(x = 20.0f, y = 14.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="8.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 18
          moveTo(x = 8.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="14.0" y="18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 18
          moveTo(x = 14.0f, y = 18.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="2" x="14.0" y="22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 22
          moveTo(x = 14.0f, y = 22.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M5 11 h22 v5 h2 V5 a2 2 0 0 0 -2 -2 H5 a2 2 0 0 0 -2 2 v22 a2 2 0 0 0 2 2 h15 v-2 H5z m22 -6 v4 H5 V5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 11
          moveTo(x = 5.0f, y = 11.0f)
          // h 22
          horizontalLineToRelative(dx = 22.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 5
          verticalLineTo(y = 5.0f)
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
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // h 15
          horizontalLineToRelative(dx = 15.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 5z
          horizontalLineTo(x = 5.0f)
          close()
          // m 22 -6
          moveToRelative(dx = 22.0f, dy = -6.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5z
          verticalLineTo(y = 5.0f)
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
      .also { _db2BufferPool = it }
  }

@Suppress("ObjectPropertyName")
private var _db2BufferPool: ImageVector? = null
