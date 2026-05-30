// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagEdit: ImageVector
  get() {
    val current = _tagEdit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TagEdit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.7 7.3 -3 -3 a1 1 0 0 0 -1.4 0 L16 13.58 V18 h4.41 l9.3 -9.3 a1 1 0 0 0 0 -1.4 M19.6 16 H18 v-1.59 l5 -5 L24.59 11Z M26 9.59 24.41 8 26 6.41 27.59 8Z M10 14 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.7 7.3
          moveTo(x = 29.7f, y = 7.3f)
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // L 16 13.58
          lineTo(x = 16.0f, y = 13.58f)
          // V 18
          verticalLineTo(y = 18.0f)
          // h 4.41
          horizontalLineToRelative(dx = 4.41f)
          // l 9.3 -9.3
          lineToRelative(dx = 9.3f, dy = -9.3f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // M 19.6 16
          moveTo(x = 19.6f, y = 16.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // L 24.59 11z
          lineTo(x = 24.59f, y = 11.0f)
          close()
          // M 26 9.59
          moveTo(x = 26.0f, y = 9.59f)
          // L 24.41 8
          lineTo(x = 24.41f, y = 8.0f)
          // L 26 6.41
          lineTo(x = 26.0f, y = 6.41f)
          // L 27.59 8z
          lineTo(x = 27.59f, y = 8.0f)
          close()
          // M 10 14
          moveTo(x = 10.0f, y = 14.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        }
        // m27 14.24 -1.4 1.4 2.4 2.42 L18.06 28 4 13.94 V4 h9.94 l4.4 4.4 L19.77 7 l-4.4 -4.41 A2 2 0 0 0 13.94 2 H4 a2 2 0 0 0 -2 2 v9.94 a2 2 0 0 0 .59 1.42 L16.64 29.4 a2 2 0 0 0 2.83 0 l9.94 -9.94 a2 2 0 0 0 0 -2.83Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 14.24
          moveTo(x = 27.0f, y = 14.24f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 2.4 2.42
          lineToRelative(dx = 2.4f, dy = 2.42f)
          // L 18.06 28
          lineTo(x = 18.06f, y = 28.0f)
          // L 4 13.94
          lineTo(x = 4.0f, y = 13.94f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 9.94
          horizontalLineToRelative(dx = 9.94f)
          // l 4.4 4.4
          lineToRelative(dx = 4.4f, dy = 4.4f)
          // L 19.77 7
          lineTo(x = 19.77f, y = 7.0f)
          // l -4.4 -4.41
          lineToRelative(dx = -4.4f, dy = -4.41f)
          // A 2 2 0 0 0 13.94 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.94f,
            y1 = 2.0f,
          )
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
          // v 9.94
          verticalLineToRelative(dy = 9.94f)
          // a 2 2 0 0 0 0.59 1.42
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.59f,
            dy1 = 1.42f,
          )
          // L 16.64 29.4
          lineTo(x = 16.64f, y = 29.4f)
          // a 2 2 0 0 0 2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.83f,
            dy1 = 0.0f,
          )
          // l 9.94 -9.94
          lineToRelative(dx = 9.94f, dy = -9.94f)
          // a 2 2 0 0 0 0 -2.83z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.83f,
          )
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
      .also { _tagEdit = it }
  }

@Suppress("ObjectPropertyName")
private var _tagEdit: ImageVector? = null
