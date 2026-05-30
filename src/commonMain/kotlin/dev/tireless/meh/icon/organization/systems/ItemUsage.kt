// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ItemUsage: ImageVector
  get() {
    val current = _itemUsage
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ItemUsage",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 30 H11 c-5 0 -9 -4 -9 -9 V11 c0 -5 4 -9 9 -9 h10 c5 0 9 4 9 9 v10 c0 5 -4 9 -9 9 M11 4 c-3.9 0 -7 3.1 -7 7 v10 c0 3.9 3.1 7 7 7 h10 c3.9 0 7 -3.1 7 -7 V11 c0 -3.9 -3.1 -7 -7 -7z m-1 18 v-1.82 h1.58 v-8.36 H10 V10 h5.45 v1.82 h-1.6 v8.36 h1.6 V22z m8.1 -2.29 v-4.95 h-1.33 v-1.75 h.68 c.66 0 .86 -.3 .86 -.93 v-1.52 h1.98 v2.45 h1.84 v1.75 H20.3 v5.49 H22 V22 h-1.58 c-1.51 0 -2.32 -.83 -2.32 -2.29
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 30
          moveTo(x = 21.0f, y = 30.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -5 0 -9 -4 -9 -9
          curveToRelative(
            dx1 = -5.0f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = -4.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -5 4 -9 9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.0f,
            dx2 = 4.0f,
            dy2 = -9.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 5 0 9 4 9 9
          curveToRelative(
            dx1 = 5.0f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = 4.0f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 5 -4 9 -9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 5.0f,
            dx2 = -4.0f,
            dy2 = 9.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // M 11 4
          moveTo(x = 11.0f, y = 4.0f)
          // c -3.9 0 -7 3.1 -7 7
          curveToRelative(
            dx1 = -3.9f,
            dy1 = 0.0f,
            dx2 = -7.0f,
            dy2 = 3.1f,
            dx3 = -7.0f,
            dy3 = 7.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 3.9 3.1 7 7 7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.9f,
            dx2 = 3.1f,
            dy2 = 7.0f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 3.9 0 7 -3.1 7 -7
          curveToRelative(
            dx1 = 3.9f,
            dy1 = 0.0f,
            dx2 = 7.0f,
            dy2 = -3.1f,
            dx3 = 7.0f,
            dy3 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -3.9 -3.1 -7 -7 -7z
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.9f,
            dx2 = -3.1f,
            dy2 = -7.0f,
            dx3 = -7.0f,
            dy3 = -7.0f,
          )
          close()
          // m -1 18
          moveToRelative(dx = -1.0f, dy = 18.0f)
          // v -1.82
          verticalLineToRelative(dy = -1.82f)
          // h 1.58
          horizontalLineToRelative(dx = 1.58f)
          // v -8.36
          verticalLineToRelative(dy = -8.36f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 5.45
          horizontalLineToRelative(dx = 5.45f)
          // v 1.82
          verticalLineToRelative(dy = 1.82f)
          // h -1.6
          horizontalLineToRelative(dx = -1.6f)
          // v 8.36
          verticalLineToRelative(dy = 8.36f)
          // h 1.6
          horizontalLineToRelative(dx = 1.6f)
          // V 22z
          verticalLineTo(y = 22.0f)
          close()
          // m 8.1 -2.29
          moveToRelative(dx = 8.1f, dy = -2.29f)
          // v -4.95
          verticalLineToRelative(dy = -4.95f)
          // h -1.33
          horizontalLineToRelative(dx = -1.33f)
          // v -1.75
          verticalLineToRelative(dy = -1.75f)
          // h 0.68
          horizontalLineToRelative(dx = 0.68f)
          // c 0.66 0 0.86 -0.3 0.86 -0.93
          curveToRelative(
            dx1 = 0.66f,
            dy1 = 0.0f,
            dx2 = 0.86f,
            dy2 = -0.3f,
            dx3 = 0.86f,
            dy3 = -0.93f,
          )
          // v -1.52
          verticalLineToRelative(dy = -1.52f)
          // h 1.98
          horizontalLineToRelative(dx = 1.98f)
          // v 2.45
          verticalLineToRelative(dy = 2.45f)
          // h 1.84
          horizontalLineToRelative(dx = 1.84f)
          // v 1.75
          verticalLineToRelative(dy = 1.75f)
          // H 20.3
          horizontalLineTo(x = 20.3f)
          // v 5.49
          verticalLineToRelative(dy = 5.49f)
          // H 22
          horizontalLineTo(x = 22.0f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h -1.58
          horizontalLineToRelative(dx = -1.58f)
          // c -1.51 0 -2.32 -0.83 -2.32 -2.29
          curveToRelative(
            dx1 = -1.51f,
            dy1 = 0.0f,
            dx2 = -2.32f,
            dy2 = -0.83f,
            dx3 = -2.32f,
            dy3 = -2.29f,
          )
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
      .also { _itemUsage = it }
  }

@Suppress("ObjectPropertyName")
private var _itemUsage: ImageVector? = null
