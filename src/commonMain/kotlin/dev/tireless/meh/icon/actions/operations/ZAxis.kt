// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ZAxis: ImageVector
  get() {
    val current = _zAxis
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ZAxis",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="26.0 22.0 26.0 25.586 17.0 16.586 17.0 10.0 17.0 6.0 17.0 5.828 19.586 8.414 21.0 7.0 16.0 2.0 11.0 7.0 12.414 8.414 15.0 5.828 15.0 6.0 15.0 10.0 15.0 16.586 6.0 25.586 6.0 22.0 4.0 22.0 4.0 29.0 11.0 29.0 11.0 27.0 7.414 27.0 16.0 18.414 24.586 27.0 21.0 27.0 21.0 29.0 28.0 29.0 28.0 22.0 26.0 22.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 22
          moveTo(x = 26.0f, y = 22.0f)
          // L 26 25.586
          lineTo(x = 26.0f, y = 25.586f)
          // L 17 16.586
          lineTo(x = 17.0f, y = 16.586f)
          // L 17 10
          lineTo(x = 17.0f, y = 10.0f)
          // L 17 6
          lineTo(x = 17.0f, y = 6.0f)
          // L 17 5.828
          lineTo(x = 17.0f, y = 5.828f)
          // L 19.586 8.414
          lineTo(x = 19.586f, y = 8.414f)
          // L 21 7
          lineTo(x = 21.0f, y = 7.0f)
          // L 16 2
          lineTo(x = 16.0f, y = 2.0f)
          // L 11 7
          lineTo(x = 11.0f, y = 7.0f)
          // L 12.414 8.414
          lineTo(x = 12.414f, y = 8.414f)
          // L 15 5.828
          lineTo(x = 15.0f, y = 5.828f)
          // L 15 6
          lineTo(x = 15.0f, y = 6.0f)
          // L 15 10
          lineTo(x = 15.0f, y = 10.0f)
          // L 15 16.586
          lineTo(x = 15.0f, y = 16.586f)
          // L 6 25.586
          lineTo(x = 6.0f, y = 25.586f)
          // L 6 22
          lineTo(x = 6.0f, y = 22.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 4 29
          lineTo(x = 4.0f, y = 29.0f)
          // L 11 29
          lineTo(x = 11.0f, y = 29.0f)
          // L 11 27
          lineTo(x = 11.0f, y = 27.0f)
          // L 7.414 27
          lineTo(x = 7.414f, y = 27.0f)
          // L 16 18.414
          lineTo(x = 16.0f, y = 18.414f)
          // L 24.586 27
          lineTo(x = 24.586f, y = 27.0f)
          // L 21 27
          lineTo(x = 21.0f, y = 27.0f)
          // L 21 29
          lineTo(x = 21.0f, y = 29.0f)
          // L 28 29
          lineTo(x = 28.0f, y = 29.0f)
          // L 28 22
          lineTo(x = 28.0f, y = 22.0f)
          // L 26 22z
          lineTo(x = 26.0f, y = 22.0f)
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
      .also { _zAxis = it }
  }

@Suppress("ObjectPropertyName")
private var _zAxis: ImageVector? = null
