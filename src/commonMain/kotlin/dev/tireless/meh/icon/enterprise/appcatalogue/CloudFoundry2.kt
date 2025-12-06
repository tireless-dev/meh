// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CloudFoundry2: ImageVector
  get() {
    val current = _cloudFoundry2
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CloudFoundry2",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 11.0 25.0 9.0 17.0 9.0 17.0 23.0 19.0 23.0 19.0 17.0 24.0 17.0 24.0 15.0 19.0 15.0 19.0 11.0 25.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // L 25 9
          lineTo(x = 25.0f, y = 9.0f)
          // L 17 9
          lineTo(x = 17.0f, y = 9.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 19 23
          lineTo(x = 19.0f, y = 23.0f)
          // L 19 17
          lineTo(x = 19.0f, y = 17.0f)
          // L 24 17
          lineTo(x = 24.0f, y = 17.0f)
          // L 24 15
          lineTo(x = 24.0f, y = 15.0f)
          // L 19 15
          lineTo(x = 19.0f, y = 15.0f)
          // L 19 11
          lineTo(x = 19.0f, y = 11.0f)
          // L 25 11z
          lineTo(x = 25.0f, y = 11.0f)
          close()
        }
        // M15 23 H9 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h6 v2 H9 v10 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 23
          moveTo(x = 15.0f, y = 23.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
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
          // V 11
          verticalLineTo(y = 11.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
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
      .also { _cloudFoundry2 = it }
  }

@Suppress("ObjectPropertyName")
private var _cloudFoundry2: ImageVector? = null
