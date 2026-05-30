// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SessionBorderControl: ImageVector
  get() {
    val current = _sessionBorderControl
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SessionBorderControl",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m26 8 -1.41 1.41 L27.17 12 H16 a6 6 0 0 0 -4 1.54 V6.83 l2.59 2.58 L16 8 l-5 -5 -5 5 1.41 1.41 L10 6.83 V18 a6 6 0 0 0 1.54 4 H4.83 l2.58 -2.59 L6 18 l-5 5 5 5 1.41 -1.41 L4.83 24 H16 a5.99 5.99 0 0 0 4.46 -10 h6.71 l-2.58 2.59 L26 18 l5 -5Z m-6 10 a4 4 0 1 1 -4 -4 4 4 0 0 1 4 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 8
          moveTo(x = 26.0f, y = 8.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 27.17 12
          lineTo(x = 27.17f, y = 12.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // a 6 6 0 0 0 -4 1.54
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.0f,
            dy1 = 1.54f,
          )
          // V 6.83
          verticalLineTo(y = 6.83f)
          // l 2.59 2.58
          lineToRelative(dx = 2.59f, dy = 2.58f)
          // L 16 8
          lineTo(x = 16.0f, y = 8.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 10 6.83
          lineTo(x = 10.0f, y = 6.83f)
          // V 18
          verticalLineTo(y = 18.0f)
          // a 6 6 0 0 0 1.54 4
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.54f,
            dy1 = 4.0f,
          )
          // H 4.83
          horizontalLineTo(x = 4.83f)
          // l 2.58 -2.59
          lineToRelative(dx = 2.58f, dy = -2.59f)
          // L 6 18
          lineTo(x = 6.0f, y = 18.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // L 4.83 24
          lineTo(x = 4.83f, y = 24.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // a 5.99 5.99 0 0 0 4.46 -10
          arcToRelative(
            a = 5.99f,
            b = 5.99f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.46f,
            dy1 = -10.0f,
          )
          // h 6.71
          horizontalLineToRelative(dx = 6.71f)
          // l -2.58 2.59
          lineToRelative(dx = -2.58f, dy = 2.59f)
          // L 26 18
          lineTo(x = 26.0f, y = 18.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
          close()
          // m -6 10
          moveToRelative(dx = -6.0f, dy = 10.0f)
          // a 4 4 0 1 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
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
      .also { _sessionBorderControl = it }
  }

@Suppress("ObjectPropertyName")
private var _sessionBorderControl: ImageVector? = null
