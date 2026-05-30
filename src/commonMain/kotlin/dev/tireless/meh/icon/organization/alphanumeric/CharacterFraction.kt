// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CharacterFraction: ImageVector
  get() {
    val current = _characterFraction
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CharacterFraction",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 30 h-8 v-6 a2 2 0 0 1 2 -2 h4 v-4 h-6 v-2 h6 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-4 v4 h6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 30
          moveTo(x = 28.0f, y = 30.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
        }
        // <rect width="22" height="2" x="4.479" y="15.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.999869 23.585915
          moveTo(x = 6.999869f, y = 23.585915f)
          // l 15.556349 -15.556349
          lineToRelative(dx = 15.556349f, dy = -15.556349f)
          // l 1.4142135 1.4142135
          lineToRelative(dx = 1.4142135f, dy = 1.4142135f)
          // l -15.556349 15.556349z
          lineToRelative(dx = -15.556349f, dy = 15.556349f)
          close()
        }
        // <polygon points="4.5 15.5 4.5 14.5 7.5 14.5 7.5 3.5 4.5 3.5 4.5 2.5 8.5 2.5 8.5 14.5 11.5 14.5 11.5 15.5 4.5 15.5" fill="#000" style="fill:#fff" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.5 15.5
          moveTo(x = 4.5f, y = 15.5f)
          // L 4.5 14.5
          lineTo(x = 4.5f, y = 14.5f)
          // L 7.5 14.5
          lineTo(x = 7.5f, y = 14.5f)
          // L 7.5 3.5
          lineTo(x = 7.5f, y = 3.5f)
          // L 4.5 3.5
          lineTo(x = 4.5f, y = 3.5f)
          // L 4.5 2.5
          lineTo(x = 4.5f, y = 2.5f)
          // L 8.5 2.5
          lineTo(x = 8.5f, y = 2.5f)
          // L 8.5 14.5
          lineTo(x = 8.5f, y = 14.5f)
          // L 11.5 14.5
          lineTo(x = 11.5f, y = 14.5f)
          // L 11.5 15.5
          lineTo(x = 11.5f, y = 15.5f)
          // L 4.5 15.5z
          lineTo(x = 4.5f, y = 15.5f)
          close()
        }
        // M8 3 v12z m1 -1 H4 v2 h3 v10 H4 v2 h8 v-2 H9z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 3
          moveTo(x = 8.0f, y = 3.0f)
          // v 12z
          verticalLineToRelative(dy = 12.0f)
          close()
          // m 1 -1
          moveToRelative(dx = 1.0f, dy = -1.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 9z
          horizontalLineTo(x = 9.0f)
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
      .also { _characterFraction = it }
  }

@Suppress("ObjectPropertyName")
private var _characterFraction: ImageVector? = null
