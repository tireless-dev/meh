// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModelBuilderReference: ImageVector
  get() {
    val current = _modelBuilderReference
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ModelBuilderReference",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="4.0 20.0 4.0 22.0 8.586 22.0 2.0 28.586 3.414 30.0 10.0 23.414 10.0 28.0 12.0 28.0 12.0 20.0 4.0 20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 20
          moveTo(x = 4.0f, y = 20.0f)
          // L 4 22
          lineTo(x = 4.0f, y = 22.0f)
          // L 8.586 22
          lineTo(x = 8.586f, y = 22.0f)
          // L 2 28.586
          lineTo(x = 2.0f, y = 28.586f)
          // L 3.414 30
          lineTo(x = 3.414f, y = 30.0f)
          // L 10 23.414
          lineTo(x = 10.0f, y = 23.414f)
          // L 10 28
          lineTo(x = 10.0f, y = 28.0f)
          // L 12 28
          lineTo(x = 12.0f, y = 28.0f)
          // L 12 20
          lineTo(x = 12.0f, y = 20.0f)
          // L 4 20z
          lineTo(x = 4.0f, y = 20.0f)
          close()
        }
        // M22 4 v3 H10 V4 H2 v8 h8 V9 h7.02 A5 5 0 0 0 16 12 v16 h2 V12 a3 3 0 0 1 3 -3 h1 v3 h8 V4Z M8 10 H4 V6 h4Z m20 0 h-4 V6 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 4
          moveTo(x = 22.0f, y = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 7.02
          horizontalLineToRelative(dx = 7.02f)
          // A 5 5 0 0 0 16 12
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 12.0f,
          )
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 20 0
          moveToRelative(dx = 20.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 6
          verticalLineTo(y = 6.0f)
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
      .also { _modelBuilderReference = it }
  }

@Suppress("ObjectPropertyName")
private var _modelBuilderReference: ImageVector? = null
