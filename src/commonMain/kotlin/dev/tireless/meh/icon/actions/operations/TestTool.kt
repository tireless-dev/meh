// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TestTool: ImageVector
  get() {
    val current = _testTool
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TestTool",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.0 9.2 20.4 6.6 19.0 8.0 23.0 12.0 30.0 5.0 28.6 3.6" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 9.2
          moveTo(x = 23.0f, y = 9.2f)
          // L 20.4 6.6
          lineTo(x = 20.4f, y = 6.6f)
          // L 19 8
          lineTo(x = 19.0f, y = 8.0f)
          // L 23 12
          lineTo(x = 23.0f, y = 12.0f)
          // L 30 5
          lineTo(x = 30.0f, y = 5.0f)
          // L 28.6 3.6z
          lineTo(x = 28.6f, y = 3.6f)
          close()
        }
        // <polygon points="12.0 5.4 10.6 4.0 8.0 6.6 5.4 4.0 4.0 5.4 6.6 8.0 4.0 10.6 5.4 12.0 8.0 9.4 10.6 12.0 12.0 10.6 9.4 8.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 5.4
          moveTo(x = 12.0f, y = 5.4f)
          // L 10.6 4
          lineTo(x = 10.6f, y = 4.0f)
          // L 8 6.6
          lineTo(x = 8.0f, y = 6.6f)
          // L 5.4 4
          lineTo(x = 5.4f, y = 4.0f)
          // L 4 5.4
          lineTo(x = 4.0f, y = 5.4f)
          // L 6.6 8
          lineTo(x = 6.6f, y = 8.0f)
          // L 4 10.6
          lineTo(x = 4.0f, y = 10.6f)
          // L 5.4 12
          lineTo(x = 5.4f, y = 12.0f)
          // L 8 9.4
          lineTo(x = 8.0f, y = 9.4f)
          // L 10.6 12
          lineTo(x = 10.6f, y = 12.0f)
          // L 12 10.6
          lineTo(x = 12.0f, y = 10.6f)
          // L 9.4 8z
          lineTo(x = 9.4f, y = 8.0f)
          close()
        }
        // <polygon points="12.0 21.4 10.6 20.0 8.0 22.6 5.4 20.0 4.0 21.4 6.6 24.0 4.0 26.6 5.4 28.0 8.0 25.4 10.6 28.0 12.0 26.6 9.4 24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 21.4
          moveTo(x = 12.0f, y = 21.4f)
          // L 10.6 20
          lineTo(x = 10.6f, y = 20.0f)
          // L 8 22.6
          lineTo(x = 8.0f, y = 22.6f)
          // L 5.4 20
          lineTo(x = 5.4f, y = 20.0f)
          // L 4 21.4
          lineTo(x = 4.0f, y = 21.4f)
          // L 6.6 24
          lineTo(x = 6.6f, y = 24.0f)
          // L 4 26.6
          lineTo(x = 4.0f, y = 26.6f)
          // L 5.4 28
          lineTo(x = 5.4f, y = 28.0f)
          // L 8 25.4
          lineTo(x = 8.0f, y = 25.4f)
          // L 10.6 28
          lineTo(x = 10.6f, y = 28.0f)
          // L 12 26.6
          lineTo(x = 12.0f, y = 26.6f)
          // L 9.4 24z
          lineTo(x = 9.4f, y = 24.0f)
          close()
        }
        // <polygon points="17.0 15.0 17.0 2.0 15.0 2.0 15.0 15.0 2.0 15.0 2.0 17.0 15.0 17.0 15.0 30.0 17.0 30.0 17.0 17.0 30.0 17.0 30.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 15
          moveTo(x = 17.0f, y = 15.0f)
          // L 17 2
          lineTo(x = 17.0f, y = 2.0f)
          // L 15 2
          lineTo(x = 15.0f, y = 2.0f)
          // L 15 15
          lineTo(x = 15.0f, y = 15.0f)
          // L 2 15
          lineTo(x = 2.0f, y = 15.0f)
          // L 2 17
          lineTo(x = 2.0f, y = 17.0f)
          // L 15 17
          lineTo(x = 15.0f, y = 17.0f)
          // L 15 30
          lineTo(x = 15.0f, y = 30.0f)
          // L 17 30
          lineTo(x = 17.0f, y = 30.0f)
          // L 17 17
          lineTo(x = 17.0f, y = 17.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 30 15z
          lineTo(x = 30.0f, y = 15.0f)
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
      .also { _testTool = it }
  }

@Suppress("ObjectPropertyName")
private var _testTool: ImageVector? = null
