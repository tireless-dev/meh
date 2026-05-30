// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterEdit: ImageVector
  get() {
    val current = _filterEdit
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.FilterEdit",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 6 H4 v3.17 l7.41 7.42 .59 .58 V26 h4 v-2 h2 v2 a2 2 0 0 1 -2 2 h-4 a2 2 0 0 1 -2 -2 v-8 l-7.41 -7.41 A2 2 0 0 1 2 9.17 V6 a2 2 0 0 1 2 -2 h22Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 6
          moveTo(x = 26.0f, y = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 3.17
          verticalLineToRelative(dy = 3.17f)
          // l 7.41 7.42
          lineToRelative(dx = 7.41f, dy = 7.42f)
          // l 0.59 0.58
          lineToRelative(dx = 0.59f, dy = 0.58f)
          // V 26
          verticalLineTo(y = 26.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
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
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // l -7.41 -7.41
          lineToRelative(dx = -7.41f, dy = -7.41f)
          // A 2 2 0 0 1 2 9.17
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 9.17f,
          )
          // V 6
          verticalLineTo(y = 6.0f)
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
          // h 22z
          horizontalLineToRelative(dx = 22.0f)
          close()
        }
        // m29.71 11.29 -3 -3 a1 1 0 0 0 -1.42 0 L16 17.59 V22 h4.41 l9.3 -9.29 a1 1 0 0 0 0 -1.42 M19.59 20 H18 v-1.59 l5 -5 L24.59 15Z M26 13.59 24.41 12 26 10.41 27.59 12Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.71 11.29
          moveTo(x = 29.71f, y = 11.29f)
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 0 -1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.42f,
            dy1 = 0.0f,
          )
          // L 16 17.59
          lineTo(x = 16.0f, y = 17.59f)
          // V 22
          verticalLineTo(y = 22.0f)
          // h 4.41
          horizontalLineToRelative(dx = 4.41f)
          // l 9.3 -9.29
          lineToRelative(dx = 9.3f, dy = -9.29f)
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // M 19.59 20
          moveTo(x = 19.59f, y = 20.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // L 24.59 15z
          lineTo(x = 24.59f, y = 15.0f)
          close()
          // M 26 13.59
          moveTo(x = 26.0f, y = 13.59f)
          // L 24.41 12
          lineTo(x = 24.41f, y = 12.0f)
          // L 26 10.41
          lineTo(x = 26.0f, y = 10.41f)
          // L 27.59 12z
          lineTo(x = 27.59f, y = 12.0f)
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
      .also { _filterEdit = it }
  }

@Suppress("ObjectPropertyName")
private var _filterEdit: ImageVector? = null
