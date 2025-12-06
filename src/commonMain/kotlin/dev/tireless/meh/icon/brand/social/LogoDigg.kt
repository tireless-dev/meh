// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.social

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LogoDigg: ImageVector
  get() {
    val current = _logoDigg
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LogoDigg",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M6.48 7.6 v3.92 H2 V21 h7.28 V7.6Z m0 11.2 H4.8 v-5 h1.68Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.48 7.6
          moveTo(x = 6.48f, y = 7.6f)
          // v 3.92
          verticalLineToRelative(dy = 3.92f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 21
          verticalLineTo(y = 21.0f)
          // h 7.28
          horizontalLineToRelative(dx = 7.28f)
          // V 7.6z
          verticalLineTo(y = 7.6f)
          close()
          // m 0 11.2
          moveToRelative(dx = 0.0f, dy = 11.2f)
          // H 4.8
          horizontalLineTo(x = 4.8f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 1.68z
          horizontalLineToRelative(dx = 1.68f)
          close()
        }
        // <rect width="3" height="10" x="10.4" y="11.52" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.4 11.52
          moveTo(x = 10.4f, y = 11.52f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // <rect width="3" height="3" x="10.4" y="7.6" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10.4 7.6
          moveTo(x = 10.4f, y = 7.6f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
        }
        // M14.32 11.52 V21 h4.48 v1.12 h-4.48 v2.28 h7.28 V11.52Z m4.48 7.28 h-1.68 v-5 h1.68Z m3.92 -7.28 V21 h4.48 v1.12 h-4.48 v2.28 H30 V11.52Z m4.48 7.28 h-1.68 v-5 h1.68Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14.32 11.52
          moveTo(x = 14.32f, y = 11.52f)
          // V 21
          verticalLineTo(y = 21.0f)
          // h 4.48
          horizontalLineToRelative(dx = 4.48f)
          // v 1.12
          verticalLineToRelative(dy = 1.12f)
          // h -4.48
          horizontalLineToRelative(dx = -4.48f)
          // v 2.28
          verticalLineToRelative(dy = 2.28f)
          // h 7.28
          horizontalLineToRelative(dx = 7.28f)
          // V 11.52z
          verticalLineTo(y = 11.52f)
          close()
          // m 4.48 7.28
          moveToRelative(dx = 4.48f, dy = 7.28f)
          // h -1.68
          horizontalLineToRelative(dx = -1.68f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 1.68z
          horizontalLineToRelative(dx = 1.68f)
          close()
          // m 3.92 -7.28
          moveToRelative(dx = 3.92f, dy = -7.28f)
          // V 21
          verticalLineTo(y = 21.0f)
          // h 4.48
          horizontalLineToRelative(dx = 4.48f)
          // v 1.12
          verticalLineToRelative(dy = 1.12f)
          // h -4.48
          horizontalLineToRelative(dx = -4.48f)
          // v 2.28
          verticalLineToRelative(dy = 2.28f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // V 11.52z
          verticalLineTo(y = 11.52f)
          close()
          // m 4.48 7.28
          moveToRelative(dx = 4.48f, dy = 7.28f)
          // h -1.68
          horizontalLineToRelative(dx = -1.68f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 1.68z
          horizontalLineToRelative(dx = 1.68f)
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
      .also { _logoDigg = it }
  }

@Suppress("ObjectPropertyName")
private var _logoDigg: ImageVector? = null
