// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val IfAction: ImageVector
  get() {
    val current = _ifAction
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.IfAction",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M21 2 H11 c-5 0 -9 4 -9 9 v10 c0 5 4 9 9 9 h10 c5 0 9 -4 9 -9 V11 c0 -5 -4 -9 -9 -9 m7 19 c0 3.9 -3.1 7 -7 7 H11 c-3.9 0 -7 -3.1 -7 -7 V11 c0 -3.9 3.1 -7 7 -7 h10 c3.9 0 7 3.1 7 7z M9.88 22 v-1.82 h1.58 v-8.36 H9.88 V10 h5.45 v1.82 h-1.6 v8.36 h1.6 V22z m8.08 -7.26 h-1.33 V13 h1.33 v-1.27 c0 -1.58 .86 -2.46 2.48 -2.46 H22 v1.76 h-1.84 V13 H22 v1.74 h-1.84 V22 h-2.2z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 2
          moveTo(x = 21.0f, y = 2.0f)
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -5 0 -9 4 -9 9
          curveToRelative(
            dx1 = -5.0f,
            dy1 = 0.0f,
            dx2 = -9.0f,
            dy2 = 4.0f,
            dx3 = -9.0f,
            dy3 = 9.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // c 0 5 4 9 9 9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 5.0f,
            dx2 = 4.0f,
            dy2 = 9.0f,
            dx3 = 9.0f,
            dy3 = 9.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 5 0 9 -4 9 -9
          curveToRelative(
            dx1 = 5.0f,
            dy1 = 0.0f,
            dx2 = 9.0f,
            dy2 = -4.0f,
            dx3 = 9.0f,
            dy3 = -9.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -5 -4 -9 -9 -9
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -5.0f,
            dx2 = -4.0f,
            dy2 = -9.0f,
            dx3 = -9.0f,
            dy3 = -9.0f,
          )
          // m 7 19
          moveToRelative(dx = 7.0f, dy = 19.0f)
          // c 0 3.9 -3.1 7 -7 7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 3.9f,
            dx2 = -3.1f,
            dy2 = 7.0f,
            dx3 = -7.0f,
            dy3 = 7.0f,
          )
          // H 11
          horizontalLineTo(x = 11.0f)
          // c -3.9 0 -7 -3.1 -7 -7
          curveToRelative(
            dx1 = -3.9f,
            dy1 = 0.0f,
            dx2 = -7.0f,
            dy2 = -3.1f,
            dx3 = -7.0f,
            dy3 = -7.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // c 0 -3.9 3.1 -7 7 -7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -3.9f,
            dx2 = 3.1f,
            dy2 = -7.0f,
            dx3 = 7.0f,
            dy3 = -7.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // c 3.9 0 7 3.1 7 7z
          curveToRelative(
            dx1 = 3.9f,
            dy1 = 0.0f,
            dx2 = 7.0f,
            dy2 = 3.1f,
            dx3 = 7.0f,
            dy3 = 7.0f,
          )
          close()
          // M 9.88 22
          moveTo(x = 9.88f, y = 22.0f)
          // v -1.82
          verticalLineToRelative(dy = -1.82f)
          // h 1.58
          horizontalLineToRelative(dx = 1.58f)
          // v -8.36
          verticalLineToRelative(dy = -8.36f)
          // H 9.88
          horizontalLineTo(x = 9.88f)
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
          // m 8.08 -7.26
          moveToRelative(dx = 8.08f, dy = -7.26f)
          // h -1.33
          horizontalLineToRelative(dx = -1.33f)
          // V 13
          verticalLineTo(y = 13.0f)
          // h 1.33
          horizontalLineToRelative(dx = 1.33f)
          // v -1.27
          verticalLineToRelative(dy = -1.27f)
          // c 0 -1.58 0.86 -2.46 2.48 -2.46
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.58f,
            dx2 = 0.86f,
            dy2 = -2.46f,
            dx3 = 2.48f,
            dy3 = -2.46f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 1.76
          verticalLineToRelative(dy = 1.76f)
          // h -1.84
          horizontalLineToRelative(dx = -1.84f)
          // V 13
          verticalLineTo(y = 13.0f)
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 1.74
          verticalLineToRelative(dy = 1.74f)
          // h -1.84
          horizontalLineToRelative(dx = -1.84f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h -2.2z
          horizontalLineToRelative(dx = -2.2f)
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
      .also { _ifAction = it }
  }

@Suppress("ObjectPropertyName")
private var _ifAction: ImageVector? = null
