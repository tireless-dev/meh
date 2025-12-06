// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RepoSourceCode: ImageVector
  get() {
    val current = _repoSourceCode
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RepoSourceCode",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.6 21.4 27.2 25.0 27.2 25.0 23.6 28.6 25.0 30.0 30.0 25.0 25.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.6 21.4
          moveTo(x = 23.6f, y = 21.4f)
          // L 27.2 25
          lineTo(x = 27.2f, y = 25.0f)
          // L 27.2 25
          lineTo(x = 27.2f, y = 25.0f)
          // L 23.6 28.6
          lineTo(x = 23.6f, y = 28.6f)
          // L 25 30
          lineTo(x = 25.0f, y = 30.0f)
          // L 30 25
          lineTo(x = 30.0f, y = 25.0f)
          // L 25 20z
          lineTo(x = 25.0f, y = 20.0f)
          close()
        }
        // <polygon points="20.4 21.4 16.8 25.0 16.8 25.0 20.4 28.6 19.0 30.0 14.0 25.0 19.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.4 21.4
          moveTo(x = 20.4f, y = 21.4f)
          // L 16.8 25
          lineTo(x = 16.8f, y = 25.0f)
          // L 16.8 25
          lineTo(x = 16.8f, y = 25.0f)
          // L 20.4 28.6
          lineTo(x = 20.4f, y = 28.6f)
          // L 19 30
          lineTo(x = 19.0f, y = 30.0f)
          // L 14 25
          lineTo(x = 14.0f, y = 25.0f)
          // L 19 20z
          lineTo(x = 19.0f, y = 20.0f)
          close()
        }
        // M28 8 H16 l-3.4 -3.4 A2 2 0 0 0 11.2 4 H4 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h7 v-2 H4 V6 h7.2 l3.4 3.4 .6 .6 H28 v8 h2 v-8 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // l -3.4 -3.4
          lineToRelative(dx = -3.4f, dy = -3.4f)
          // A 2 2 0 0 0 11.2 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.2f,
            y1 = 4.0f,
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 7.2
          horizontalLineToRelative(dx = 7.2f)
          // l 3.4 3.4
          lineToRelative(dx = 3.4f, dy = 3.4f)
          // l 0.6 0.6
          lineToRelative(dx = 0.6f, dy = 0.6f)
          // H 28
          horizontalLineTo(x = 28.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
      .also { _repoSourceCode = it }
  }

@Suppress("ObjectPropertyName")
private var _repoSourceCode: ImageVector? = null
