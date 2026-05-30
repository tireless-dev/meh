// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val GemReference: ImageVector
  get() {
    val current = _gemReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.GemReference",
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
        // M23.5 4 h-15 l-6.78 9.05 L6 18 l1.51 -1.31 L5.2 14 h5.26 L16 22.89 21.55 14 h5.26 l-11 12.7 1.51 1.3 12.96 -14.95Z M5 12 l4.5 -6 h4.7 l-3.75 6Z m11 -5.11 L19.2 12 h-6.4Z m0 12.22 L12.8 14 h6.4Z M21.55 12 17.8 6 h4.7 l4.5 6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 4
          moveTo(x = 23.5f, y = 4.0f)
          // h -15
          horizontalLineToRelative(dx = -15.0f)
          // l -6.78 9.05
          lineToRelative(dx = -6.78f, dy = 9.05f)
          // L 6 18
          lineTo(x = 6.0f, y = 18.0f)
          // l 1.51 -1.31
          lineToRelative(dx = 1.51f, dy = -1.31f)
          // L 5.2 14
          lineTo(x = 5.2f, y = 14.0f)
          // h 5.26
          horizontalLineToRelative(dx = 5.26f)
          // L 16 22.89
          lineTo(x = 16.0f, y = 22.89f)
          // L 21.55 14
          lineTo(x = 21.55f, y = 14.0f)
          // h 5.26
          horizontalLineToRelative(dx = 5.26f)
          // l -11 12.7
          lineToRelative(dx = -11.0f, dy = 12.7f)
          // l 1.51 1.3
          lineToRelative(dx = 1.51f, dy = 1.3f)
          // l 12.96 -14.95z
          lineToRelative(dx = 12.96f, dy = -14.95f)
          close()
          // M 5 12
          moveTo(x = 5.0f, y = 12.0f)
          // l 4.5 -6
          lineToRelative(dx = 4.5f, dy = -6.0f)
          // h 4.7
          horizontalLineToRelative(dx = 4.7f)
          // l -3.75 6z
          lineToRelative(dx = -3.75f, dy = 6.0f)
          close()
          // m 11 -5.11
          moveToRelative(dx = 11.0f, dy = -5.11f)
          // L 19.2 12
          lineTo(x = 19.2f, y = 12.0f)
          // h -6.4z
          horizontalLineToRelative(dx = -6.4f)
          close()
          // m 0 12.22
          moveToRelative(dx = 0.0f, dy = 12.22f)
          // L 12.8 14
          lineTo(x = 12.8f, y = 14.0f)
          // h 6.4z
          horizontalLineToRelative(dx = 6.4f)
          close()
          // M 21.55 12
          moveTo(x = 21.55f, y = 12.0f)
          // L 17.8 6
          lineTo(x = 17.8f, y = 6.0f)
          // h 4.7
          horizontalLineToRelative(dx = 4.7f)
          // l 4.5 6z
          lineToRelative(dx = 4.5f, dy = 6.0f)
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
      .also { _gemReference = it }
  }

@Suppress("ObjectPropertyName")
private var _gemReference: ImageVector? = null
