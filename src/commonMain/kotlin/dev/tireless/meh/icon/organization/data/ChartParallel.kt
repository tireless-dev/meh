// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartParallel: ImageVector
  get() {
    val current = _chartParallel
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartParallel",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 v3.3 l-6 2.26 V2 h-2 v5.52 l-8 -3.2 V2 h-2 v2.45 L4 8.2 V2 H2 v28 h2 v-2.38 l6 -3 V30 h2 v-5.66 l8 2.4 V30 h2 v-3.45 l6 -3.75 V30 h2 V2Z m0 5.44 v5.06 L22 17 V9.7Z m-8 2.24 v7.55 l-8 -4.8 V6.48Z M10 6.8 v5.75 L4 17.8 v-7.25Z M4 25.38 v-4.93 l6 -5.25 v7.18Z m8 -3.12 v-7.5 l8 4.8 v5.1Z m10 1.94 v-4.7 l6 -4.5 v5.45Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // v 3.3
          verticalLineToRelative(dy = 3.3f)
          // l -6 2.26
          lineToRelative(dx = -6.0f, dy = 2.26f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 5.52
          verticalLineToRelative(dy = 5.52f)
          // l -8 -3.2
          lineToRelative(dx = -8.0f, dy = -3.2f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.45
          verticalLineToRelative(dy = 2.45f)
          // L 4 8.2
          lineTo(x = 4.0f, y = 8.2f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 28
          verticalLineToRelative(dy = 28.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.38
          verticalLineToRelative(dy = -2.38f)
          // l 6 -3
          lineToRelative(dx = 6.0f, dy = -3.0f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5.66
          verticalLineToRelative(dy = -5.66f)
          // l 8 2.4
          lineToRelative(dx = 8.0f, dy = 2.4f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3.45
          verticalLineToRelative(dy = -3.45f)
          // l 6 -3.75
          lineToRelative(dx = 6.0f, dy = -3.75f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // m 0 5.44
          moveToRelative(dx = 0.0f, dy = 5.44f)
          // v 5.06
          verticalLineToRelative(dy = 5.06f)
          // L 22 17
          lineTo(x = 22.0f, y = 17.0f)
          // V 9.7z
          verticalLineTo(y = 9.7f)
          close()
          // m -8 2.24
          moveToRelative(dx = -8.0f, dy = 2.24f)
          // v 7.55
          verticalLineToRelative(dy = 7.55f)
          // l -8 -4.8
          lineToRelative(dx = -8.0f, dy = -4.8f)
          // V 6.48z
          verticalLineTo(y = 6.48f)
          close()
          // M 10 6.8
          moveTo(x = 10.0f, y = 6.8f)
          // v 5.75
          verticalLineToRelative(dy = 5.75f)
          // L 4 17.8
          lineTo(x = 4.0f, y = 17.8f)
          // v -7.25z
          verticalLineToRelative(dy = -7.25f)
          close()
          // M 4 25.38
          moveTo(x = 4.0f, y = 25.38f)
          // v -4.93
          verticalLineToRelative(dy = -4.93f)
          // l 6 -5.25
          lineToRelative(dx = 6.0f, dy = -5.25f)
          // v 7.18z
          verticalLineToRelative(dy = 7.18f)
          close()
          // m 8 -3.12
          moveToRelative(dx = 8.0f, dy = -3.12f)
          // v -7.5
          verticalLineToRelative(dy = -7.5f)
          // l 8 4.8
          lineToRelative(dx = 8.0f, dy = 4.8f)
          // v 5.1z
          verticalLineToRelative(dy = 5.1f)
          close()
          // m 10 1.94
          moveToRelative(dx = 10.0f, dy = 1.94f)
          // v -4.7
          verticalLineToRelative(dy = -4.7f)
          // l 6 -4.5
          lineToRelative(dx = 6.0f, dy = -4.5f)
          // v 5.45z
          verticalLineToRelative(dy = 5.45f)
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
      .also { _chartParallel = it }
  }

@Suppress("ObjectPropertyName")
private var _chartParallel: ImageVector? = null
