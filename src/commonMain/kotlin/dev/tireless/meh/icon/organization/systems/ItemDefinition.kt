// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ItemDefinition: ImageVector
  get() {
    val current = _itemDefinition
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ItemDefinition",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 m0 26 H4 V4 h24z m-18 -6 v-1.82 h1.58 v-8.36 H10 V10 h5.45 v1.82 h-1.6 v8.36 h1.6 V22z m8.1 -2.29 v-4.95 h-1.33 v-1.75 h.68 c.66 0 .86 -.3 .86 -.93 v-1.52 h1.98 v2.45 h1.84 v1.75 H20.3 v5.49 H22 V22 h-1.58 c-1.51 0 -2.32 -.83 -2.32 -2.29
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 0 26
          moveToRelative(dx = 0.0f, dy = 26.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 24z
          horizontalLineToRelative(dx = 24.0f)
          close()
          // m -18 -6
          moveToRelative(dx = -18.0f, dy = -6.0f)
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
      .also { _itemDefinition = it }
  }

@Suppress("ObjectPropertyName")
private var _itemDefinition: ImageVector? = null
