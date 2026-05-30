// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AudioConsole: ImageVector
  get() {
    val current = _audioConsole
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AudioConsole",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 14 h-1 V2 h-2 v12 h-1 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h1 v10 h2 V20 h1 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 -2 -2 m0 4 h-4 v-2 h4Z M18 6 h-1 V2 h-2 v4 h-1 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h1 v18 h2 V12 h1 a2 2 0 0 0 2 -2 V8 a2 2 0 0 0 -2 -2 m0 4 h-4 V8 h4Z M8 20 H7 V2 H5 v18 H4 a2 2 0 0 0 -2 2 v2 a2 2 0 0 0 2 2 h1 v4 h2 v-4 h1 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 -2 -2 m0 4 H4 v-2 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 14
          moveTo(x = 28.0f, y = 14.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 20
          verticalLineTo(y = 20.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 18 6
          moveTo(x = 18.0f, y = 6.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
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
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 8 20
          moveTo(x = 8.0f, y = 20.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // m 0 4
          moveToRelative(dx = 0.0f, dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _audioConsole = it }
  }

@Suppress("ObjectPropertyName")
private var _audioConsole: ImageVector? = null
