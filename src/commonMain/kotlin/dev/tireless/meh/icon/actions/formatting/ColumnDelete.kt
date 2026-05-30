// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ColumnDelete: ImageVector
  get() {
    val current = _columnDelete
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ColumnDelete",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 3.41 28.59 2.0 25.0 5.59 21.41 2.0 20.0 3.41 23.59 7.0 20.0 10.59 21.41 12.0 25.0 8.41 28.59 12.0 30.0 10.59 26.41 7.0 30.0 3.41" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 3.41
          moveTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 25 5.59
          lineTo(x = 25.0f, y = 5.59f)
          // L 21.41 2
          lineTo(x = 21.41f, y = 2.0f)
          // L 20 3.41
          lineTo(x = 20.0f, y = 3.41f)
          // L 23.59 7
          lineTo(x = 23.59f, y = 7.0f)
          // L 20 10.59
          lineTo(x = 20.0f, y = 10.59f)
          // L 21.41 12
          lineTo(x = 21.41f, y = 12.0f)
          // L 25 8.41
          lineTo(x = 25.0f, y = 8.41f)
          // L 28.59 12
          lineTo(x = 28.59f, y = 12.0f)
          // L 30 10.59
          lineTo(x = 30.0f, y = 10.59f)
          // L 26.41 7
          lineTo(x = 26.41f, y = 7.0f)
          // L 30 3.41z
          lineTo(x = 30.0f, y = 3.41f)
          close()
        }
        // M24 14 v14 h-6 V6 h-2 v22 a2 2 0 0 0 2 2 h6 a2 2 0 0 0 2 -2 V14Z M10 30 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h6 a2 2 0 0 1 2 2 v20 a2 2 0 0 1 -2 2 M4 8 v20 h6 V8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 22
          verticalLineToRelative(dy = 22.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // V 14z
          verticalLineTo(y = 14.0f)
          close()
          // M 10 30
          moveTo(x = 10.0f, y = 30.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 8z
          verticalLineTo(y = 8.0f)
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
      .also { _columnDelete = it }
  }

@Suppress("ObjectPropertyName")
private var _columnDelete: ImageVector? = null
