// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
@file:Suppress("ktlint:standard:filename")

package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FourK: ImageVector
  get() {
    val current = _4K
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.4K",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="12.0 11.03 12.0 15.03 10.0 15.03 10.0 11.03 8.0 11.03 8.0 17.03 12.0 17.03 12.0 21.03 14.0 21.03 14.0 11.03 12.0 11.03" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 11.03
          moveTo(x = 12.0f, y = 11.03f)
          // L 12 15.03
          lineTo(x = 12.0f, y = 15.03f)
          // L 10 15.03
          lineTo(x = 10.0f, y = 15.03f)
          // L 10 11.03
          lineTo(x = 10.0f, y = 11.03f)
          // L 8 11.03
          lineTo(x = 8.0f, y = 11.03f)
          // L 8 17.03
          lineTo(x = 8.0f, y = 17.03f)
          // L 12 17.03
          lineTo(x = 12.0f, y = 17.03f)
          // L 12 21.03
          lineTo(x = 12.0f, y = 21.03f)
          // L 14 21.03
          lineTo(x = 14.0f, y = 21.03f)
          // L 14 11.03
          lineTo(x = 14.0f, y = 11.03f)
          // L 12 11.03z
          lineTo(x = 12.0f, y = 11.03f)
          close()
        }
        // <polygon points="24.19 11.03 22.0 11.03 19.0 15.42 19.0 11.03 17.0 11.03 17.0 21.03 19.0 21.03 19.0 18.3 19.91 16.97 22.0 21.03 24.19 21.03 21.2 15.41 24.19 11.03" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.19 11.03
          moveTo(x = 24.19f, y = 11.03f)
          // L 22 11.03
          lineTo(x = 22.0f, y = 11.03f)
          // L 19 15.42
          lineTo(x = 19.0f, y = 15.42f)
          // L 19 11.03
          lineTo(x = 19.0f, y = 11.03f)
          // L 17 11.03
          lineTo(x = 17.0f, y = 11.03f)
          // L 17 21.03
          lineTo(x = 17.0f, y = 21.03f)
          // L 19 21.03
          lineTo(x = 19.0f, y = 21.03f)
          // L 19 18.3
          lineTo(x = 19.0f, y = 18.3f)
          // L 19.91 16.97
          lineTo(x = 19.91f, y = 16.97f)
          // L 22 21.03
          lineTo(x = 22.0f, y = 21.03f)
          // L 24.19 21.03
          lineTo(x = 24.19f, y = 21.03f)
          // L 21.2 15.41
          lineTo(x = 21.2f, y = 15.41f)
          // L 24.19 11.03z
          lineTo(x = 24.19f, y = 11.03f)
          close()
        }
        // M28 26 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h24 a2 2 0 0 1 2 2 v16 a2 2 0 0 1 -2 2 M4 8 v16 h24 V8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 26
          moveTo(x = 28.0f, y = 26.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
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
          // v 16
          verticalLineToRelative(dy = 16.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
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
      .also { _4K = it }
  }

@Suppress("ObjectPropertyName")
private var _4K: ImageVector? = null
