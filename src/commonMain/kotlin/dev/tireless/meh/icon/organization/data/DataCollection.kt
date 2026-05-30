// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataCollection: ImageVector
  get() {
    val current = _dataCollection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataCollection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="16.0" cy="16.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <polygon points="30.0 17.0 30.0 15.0 23.83 15.0 26.41 12.41 25.0 11.0 20.0 16.0 25.0 21.0 26.41 19.59 23.83 17.0 30.0 17.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 17
          moveTo(x = 30.0f, y = 17.0f)
          // L 30 15
          lineTo(x = 30.0f, y = 15.0f)
          // L 23.83 15
          lineTo(x = 23.83f, y = 15.0f)
          // L 26.41 12.41
          lineTo(x = 26.41f, y = 12.41f)
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // L 20 16
          lineTo(x = 20.0f, y = 16.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 26.41 19.59
          lineTo(x = 26.41f, y = 19.59f)
          // L 23.83 17
          lineTo(x = 23.83f, y = 17.0f)
          // L 30 17z
          lineTo(x = 30.0f, y = 17.0f)
          close()
        }
        // <polygon points="15.0 23.83 15.0 30.0 17.0 30.0 17.0 23.83 19.59 26.41 21.0 25.0 16.0 20.0 11.0 25.0 12.41 26.41 15.0 23.83" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 23.83
          moveTo(x = 15.0f, y = 23.83f)
          // L 15 30
          lineTo(x = 15.0f, y = 30.0f)
          // L 17 30
          lineTo(x = 17.0f, y = 30.0f)
          // L 17 23.83
          lineTo(x = 17.0f, y = 23.83f)
          // L 19.59 26.41
          lineTo(x = 19.59f, y = 26.41f)
          // L 21 25
          lineTo(x = 21.0f, y = 25.0f)
          // L 16 20
          lineTo(x = 16.0f, y = 20.0f)
          // L 11 25
          lineTo(x = 11.0f, y = 25.0f)
          // L 12.41 26.41
          lineTo(x = 12.41f, y = 26.41f)
          // L 15 23.83z
          lineTo(x = 15.0f, y = 23.83f)
          close()
        }
        // <polygon points="7.0 11.0 5.59 12.41 8.17 15.0 2.0 15.0 2.0 17.0 8.17 17.0 5.59 19.59 7.0 21.0 12.0 16.0 7.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
          // L 5.59 12.41
          lineTo(x = 5.59f, y = 12.41f)
          // L 8.17 15
          lineTo(x = 8.17f, y = 15.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 8.17 17
          lineTo(x = 8.17f, y = 17.0f)
          // L 5.59 19.59
          lineTo(x = 5.59f, y = 19.59f)
          // L 7 21
          lineTo(x = 7.0f, y = 21.0f)
          // L 12 16
          lineTo(x = 12.0f, y = 16.0f)
          // L 7 11z
          lineTo(x = 7.0f, y = 11.0f)
          close()
        }
        // <polygon points="17.0 8.17 17.0 2.0 15.0 2.0 15.0 8.17 12.41 5.59 11.0 7.0 16.0 12.0 21.0 7.0 19.59 5.59 17.0 8.17" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 8.17
          moveTo(x = 17.0f, y = 8.17f)
          // L 17 2
          lineTo(x = 17.0f, y = 2.0f)
          // L 15 2
          lineTo(x = 15.0f, y = 2.0f)
          // L 15 8.17
          lineTo(x = 15.0f, y = 8.17f)
          // L 12.41 5.59
          lineTo(x = 12.41f, y = 5.59f)
          // L 11 7
          lineTo(x = 11.0f, y = 7.0f)
          // L 16 12
          lineTo(x = 16.0f, y = 12.0f)
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // L 19.59 5.59
          lineTo(x = 19.59f, y = 5.59f)
          // L 17 8.17z
          lineTo(x = 17.0f, y = 8.17f)
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
      .also { _dataCollection = it }
  }

@Suppress("ObjectPropertyName")
private var _dataCollection: ImageVector? = null
