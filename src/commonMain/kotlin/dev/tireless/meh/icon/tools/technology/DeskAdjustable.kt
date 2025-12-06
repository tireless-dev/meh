// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeskAdjustable: ImageVector
  get() {
    val current = _deskAdjustable
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeskAdjustable",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 27.172 17.0 22.0 15.0 22.0 15.0 27.172 12.414 24.586 11.0 26.0 16.0 31.0 21.0 26.0 19.586 24.586 17.0 27.172" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 27.172
          moveTo(x = 17.0f, y = 27.172f)
          // L 17 22
          lineTo(x = 17.0f, y = 22.0f)
          // L 15 22
          lineTo(x = 15.0f, y = 22.0f)
          // L 15 27.172
          lineTo(x = 15.0f, y = 27.172f)
          // L 12.414 24.586
          lineTo(x = 12.414f, y = 24.586f)
          // L 11 26
          lineTo(x = 11.0f, y = 26.0f)
          // L 16 31
          lineTo(x = 16.0f, y = 31.0f)
          // L 21 26
          lineTo(x = 21.0f, y = 26.0f)
          // L 19.586 24.586
          lineTo(x = 19.586f, y = 24.586f)
          // L 17 27.172z
          lineTo(x = 17.0f, y = 27.172f)
          close()
        }
        // M30 12 H2 v8 h2 v10 h2 V20 h20 v10 h2 V20 h2Z m-2 6 H4 v-4 h24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 12
          moveTo(x = 30.0f, y = 12.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 20
          verticalLineTo(y = 20.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 20
          verticalLineTo(y = 20.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -2 6
          moveToRelative(dx = -2.0f, dy = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
        }
        // <polygon points="15.0 4.828 15.0 10.0 17.0 10.0 17.0 4.828 19.586 7.414 21.0 6.0 16.0 1.0 11.0 6.0 12.414 7.414 15.0 4.828" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 15 4.828
          moveTo(x = 15.0f, y = 4.828f)
          // L 15 10
          lineTo(x = 15.0f, y = 10.0f)
          // L 17 10
          lineTo(x = 17.0f, y = 10.0f)
          // L 17 4.828
          lineTo(x = 17.0f, y = 4.828f)
          // L 19.586 7.414
          lineTo(x = 19.586f, y = 7.414f)
          // L 21 6
          lineTo(x = 21.0f, y = 6.0f)
          // L 16 1
          lineTo(x = 16.0f, y = 1.0f)
          // L 11 6
          lineTo(x = 11.0f, y = 6.0f)
          // L 12.414 7.414
          lineTo(x = 12.414f, y = 7.414f)
          // L 15 4.828z
          lineTo(x = 15.0f, y = 4.828f)
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
      .also { _deskAdjustable = it }
  }

@Suppress("ObjectPropertyName")
private var _deskAdjustable: ImageVector? = null
