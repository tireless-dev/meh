// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CodeReference: ImageVector
  get() {
    val current = _codeReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CodeReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.586 22
          lineTo(x = 8.586f, y = 22.0f)
          // L 2 28.586
          lineTo(x = 2.0f, y = 28.586f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 10 23.414
          lineTo(x = 10.0f, y = 23.414f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // <polygon points="30.0 10.0 24.0 4.0 22.586 5.414 27.172 10.0 22.586 14.586 24.0 16.0 30.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 10
          moveTo(x = 30.0f, y = 10.0f)
          // L 24 4
          lineTo(x = 24.0f, y = 4.0f)
          // L 22.586 5.414
          lineTo(x = 22.586f, y = 5.414f)
          // L 27.172 10
          lineTo(x = 27.172f, y = 10.0f)
          // L 22.586 14.586
          lineTo(x = 22.586f, y = 14.586f)
          // L 24 16
          lineTo(x = 24.0f, y = 16.0f)
          // L 30 10z
          lineTo(x = 30.0f, y = 10.0f)
          close()
        }
        // <rect width="16" height="2" x="8.944" y="9.001" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13.919694 17.484035
          moveTo(x = 13.919694f, y = 17.484035f)
          // l 4.142452 -15.4544525
          lineToRelative(dx = 4.142452f, dy = -15.4544525f)
          // l 1.9318066 0.5178065
          lineToRelative(dx = 1.9318066f, dy = 0.5178065f)
          // l -4.142452 15.4544525z
          lineToRelative(dx = -4.142452f, dy = 15.4544525f)
          close()
        }
        // <polygon points="4.0 10.0 10.0 4.0 11.414 5.414 6.828 10.0 11.414 14.586 10.0 16.0 4.0 10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 10
          moveTo(x = 4.0f, y = 10.0f)
          // L 10 4
          lineTo(x = 10.0f, y = 4.0f)
          // L 11.414 5.414
          lineTo(x = 11.414f, y = 5.414f)
          // L 6.828 10
          lineTo(x = 6.828f, y = 10.0f)
          // L 11.414 14.586
          lineTo(x = 11.414f, y = 14.586f)
          // L 10 16
          lineTo(x = 10.0f, y = 16.0f)
          // L 4 10z
          lineTo(x = 4.0f, y = 10.0f)
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
      .also { _codeReference = it }
  }

@Suppress("ObjectPropertyName")
private var _codeReference: ImageVector? = null
