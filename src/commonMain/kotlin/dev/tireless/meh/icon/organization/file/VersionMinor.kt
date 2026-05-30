// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VersionMinor: ImageVector
  get() {
    val current = _versionMinor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VersionMinor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="18.5859 15.4141 16.0 12.8345 16.0 12.8345 13.4125 15.4156 12.0 14.0 16.0 10.0 20.0 14.0 18.5859 15.4141" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.5859 15.4141
          moveTo(x = 18.5859f, y = 15.4141f)
          // L 16 12.8345
          lineTo(x = 16.0f, y = 12.8345f)
          // L 16 12.8345
          lineTo(x = 16.0f, y = 12.8345f)
          // L 13.4125 15.4156
          lineTo(x = 13.4125f, y = 15.4156f)
          // L 12 14
          lineTo(x = 12.0f, y = 14.0f)
          // L 16 10
          lineTo(x = 16.0f, y = 10.0f)
          // L 20 14
          lineTo(x = 20.0f, y = 14.0f)
          // L 18.5859 15.4141z
          lineTo(x = 18.5859f, y = 15.4141f)
          close()
        }
        // <polygon points="18.5859 21.4141 16.0 18.8345 16.0 18.8345 13.4125 21.4156 12.0 20.0 16.0 16.0 20.0 20.0 18.5859 21.4141" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.5859 21.4141
          moveTo(x = 18.5859f, y = 21.4141f)
          // L 16 18.8345
          lineTo(x = 16.0f, y = 18.8345f)
          // L 16 18.8345
          lineTo(x = 16.0f, y = 18.8345f)
          // L 13.4125 21.4156
          lineTo(x = 13.4125f, y = 21.4156f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // L 20 20
          lineTo(x = 20.0f, y = 20.0f)
          // L 18.5859 21.4141z
          lineTo(x = 18.5859f, y = 21.4141f)
          close()
        }
        // M1.59 17.41 a2 2 0 0 1 0 -2.82 l13 -13 a2 2 0 0 1 2.82 0 l13 13 a2 2 0 0 1 0 2.82 l-13 13 a2 2 0 0 1 -2.82 0z M16 3 3 16 l13 13 13 -13z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 1.59 17.41
          moveTo(x = 1.59f, y = 17.41f)
          // a 2 2 0 0 1 0 -2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.82f,
          )
          // l 13 -13
          lineToRelative(dx = 13.0f, dy = -13.0f)
          // a 2 2 0 0 1 2.82 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.82f,
            dy1 = 0.0f,
          )
          // l 13 13
          lineToRelative(dx = 13.0f, dy = 13.0f)
          // a 2 2 0 0 1 0 2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.82f,
          )
          // l -13 13
          lineToRelative(dx = -13.0f, dy = 13.0f)
          // a 2 2 0 0 1 -2.82 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.82f,
            dy1 = 0.0f,
          )
          close()
          // M 16 3
          moveTo(x = 16.0f, y = 3.0f)
          // L 3 16
          lineTo(x = 3.0f, y = 16.0f)
          // l 13 13
          lineToRelative(dx = 13.0f, dy = 13.0f)
          // l 13 -13z
          lineToRelative(dx = 13.0f, dy = -13.0f)
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
      .also { _versionMinor = it }
  }

@Suppress("ObjectPropertyName")
private var _versionMinor: ImageVector? = null
