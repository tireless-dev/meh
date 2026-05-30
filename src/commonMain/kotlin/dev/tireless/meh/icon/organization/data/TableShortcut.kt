// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableShortcut: ImageVector
  get() {
    val current = _tableShortcut
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TableShortcut",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="5.0 18.0 5.0 20.0 10.586 20.0 3.0 27.586 4.414 29.0 12.0 21.414 12.0 27.0 14.0 27.0 14.0 18.0 5.0 18.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 5 18
          moveTo(x = 5.0f, y = 18.0f)
          // L 5 20
          lineTo(x = 5.0f, y = 20.0f)
          // L 10.586 20
          lineTo(x = 10.586f, y = 20.0f)
          // L 3 27.586
          lineTo(x = 3.0f, y = 27.586f)
          // L 4.414 29
          lineTo(x = 4.414f, y = 29.0f)
          // L 12 21.414
          lineTo(x = 12.0f, y = 21.414f)
          // L 12 27
          lineTo(x = 12.0f, y = 27.0f)
          // L 14 27
          lineTo(x = 14.0f, y = 27.0f)
          // L 14 18
          lineTo(x = 14.0f, y = 18.0f)
          // L 5 18z
          lineTo(x = 5.0f, y = 18.0f)
          close()
        }
        // M27 3 H5 a2 2 0 0 0 -2 2 v10 h2 v-4 h10 v4 h2 v-4 h10 v7 H17 v2 h10 v7 H17 v2 h10 a2 2 0 0 0 2 -2 V5 a2 2 0 0 0 -2 -2 m0 6 H5 V5 h22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 3
          moveTo(x = 27.0f, y = 3.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
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
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
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
          // V 5
          verticalLineTo(y = 5.0f)
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
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h 22z
          horizontalLineToRelative(dx = 22.0f)
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
      .also { _tableShortcut = it }
  }

@Suppress("ObjectPropertyName")
private var _tableShortcut: ImageVector? = null
