// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Package: ImageVector
  get() {
    val current = _package
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Package",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 30 H6 a2 2 0 0 1 -2 -2 V16 a2 2 0 0 1 2 -2 h3 v2 H6 v12 h20 V16 h-3 v-2 h3 a2 2 0 0 1 2 2 v12 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 30
          moveTo(x = 26.0f, y = 30.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 16
          verticalLineTo(y = 16.0f)
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
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
        }
        // <rect width="6" height="2" x="13.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 20
          moveTo(x = 13.0f, y = 20.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <polygon points="20.59 8.59 17.0 12.17 17.0 2.0 15.0 2.0 15.0 12.17 11.41 8.59 10.0 10.0 16.0 16.0 22.0 10.0 20.59 8.59" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.59 8.59
          moveTo(x = 20.59f, y = 8.59f)
          // L 17 12.17
          lineTo(x = 17.0f, y = 12.17f)
          // L 17 2
          lineTo(x = 17.0f, y = 2.0f)
          // L 15 2
          lineTo(x = 15.0f, y = 2.0f)
          // L 15 12.17
          lineTo(x = 15.0f, y = 12.17f)
          // L 11.41 8.59
          lineTo(x = 11.41f, y = 8.59f)
          // L 10 10
          lineTo(x = 10.0f, y = 10.0f)
          // L 16 16
          lineTo(x = 16.0f, y = 16.0f)
          // L 22 10
          lineTo(x = 22.0f, y = 10.0f)
          // L 20.59 8.59z
          lineTo(x = 20.59f, y = 8.59f)
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
      .also { _package = it }
  }

@Suppress("ObjectPropertyName")
private var _package: ImageVector? = null
