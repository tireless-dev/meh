// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IntentRequestScaleIn: ImageVector
  get() {
    val current = _intentRequestScaleIn
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IntentRequestScaleIn",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.6 30.0 30.0 28.6 22.4 21.0 29.0 21.0 29.0 19.0 19.0 19.0 19.0 29.0 21.0 29.0 21.0 22.4" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.6 30
          moveTo(x = 28.6f, y = 30.0f)
          // L 30 28.6
          lineTo(x = 30.0f, y = 28.6f)
          // L 22.4 21
          lineTo(x = 22.4f, y = 21.0f)
          // L 29 21
          lineTo(x = 29.0f, y = 21.0f)
          // L 29 19
          lineTo(x = 29.0f, y = 19.0f)
          // L 19 19
          lineTo(x = 19.0f, y = 19.0f)
          // L 19 29
          lineTo(x = 19.0f, y = 29.0f)
          // L 21 29
          lineTo(x = 21.0f, y = 29.0f)
          // L 21 22.4z
          lineTo(x = 21.0f, y = 22.4f)
          close()
        }
        // <polygon points="2.0 28.6 3.4 30.0 11.0 22.4 11.0 29.0 13.0 29.0 13.0 19.0 3.0 19.0 3.0 21.0 9.6 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 28.6
          moveTo(x = 2.0f, y = 28.6f)
          // L 3.4 30
          lineTo(x = 3.4f, y = 30.0f)
          // L 11 22.4
          lineTo(x = 11.0f, y = 22.4f)
          // L 11 29
          lineTo(x = 11.0f, y = 29.0f)
          // L 13 29
          lineTo(x = 13.0f, y = 29.0f)
          // L 13 19
          lineTo(x = 13.0f, y = 19.0f)
          // L 3 19
          lineTo(x = 3.0f, y = 19.0f)
          // L 3 21
          lineTo(x = 3.0f, y = 21.0f)
          // L 9.6 21z
          lineTo(x = 9.6f, y = 21.0f)
          close()
        }
        // <polygon points="17.0 2.0 15.0 2.0 15.0 12.2 10.4 7.6 9.0 9.0 16.0 16.0 23.0 9.0 21.6 7.6 17.0 12.2" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 2
          moveTo(x = 17.0f, y = 2.0f)
          // L 15 2
          lineTo(x = 15.0f, y = 2.0f)
          // L 15 12.2
          lineTo(x = 15.0f, y = 12.2f)
          // L 10.4 7.6
          lineTo(x = 10.4f, y = 7.6f)
          // L 9 9
          lineTo(x = 9.0f, y = 9.0f)
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // L 23 9
          lineTo(x = 23.0f, y = 9.0f)
          // L 21.6 7.6
          lineTo(x = 21.6f, y = 7.6f)
          // L 17 12.2z
          lineTo(x = 17.0f, y = 12.2f)
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
      .also { _intentRequestScaleIn = it }
  }

@Suppress("ObjectPropertyName")
private var _intentRequestScaleIn: ImageVector? = null
