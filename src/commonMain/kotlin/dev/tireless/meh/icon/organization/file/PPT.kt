// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PPT: ImageVector
  get() {
    val current = _pPT
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PPT",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="22.0 11.0 25.0 11.0 25.0 23.0 27.0 23.0 27.0 11.0 30.0 11.0 30.0 9.0 22.0 9.0 22.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 11
          moveTo(x = 22.0f, y = 11.0f)
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 27 23
          lineTo(x = 27.0f, y = 23.0f)
          // L 27 11
          lineTo(x = 27.0f, y = 11.0f)
          // L 30 11
          lineTo(x = 30.0f, y = 11.0f)
          // L 30 9
          lineTo(x = 30.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 11z
          lineTo(x = 22.0f, y = 11.0f)
          close()
        }
        // M14 23 h-2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 h-4Z m0 -7 h4 v-5 h-4Z M4 23 H2 V9 h6 a2 2 0 0 1 2 2 v5 a2 2 0 0 1 -2 2 H4Z m0 -7 h4 v-5 H4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 23
          moveTo(x = 14.0f, y = 23.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
          // M 4 23
          moveTo(x = 4.0f, y = 23.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
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
      .also { _pPT = it }
  }

@Suppress("ObjectPropertyName")
private var _pPT: ImageVector? = null
