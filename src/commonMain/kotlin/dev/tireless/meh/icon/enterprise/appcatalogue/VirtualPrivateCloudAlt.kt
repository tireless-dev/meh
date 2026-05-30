// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val VirtualPrivateCloudAlt: ImageVector
  get() {
    val current = _virtualPrivateCloudAlt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.VirtualPrivateCloudAlt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23.41 22 10 8.59 V2 H2 v8 h6.59 L22 23.41 V30 h8 v-8Z M8 8 H4 V4 h4Z m20 20 h-4 v-4 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.41 22
          moveTo(x = 23.41f, y = 22.0f)
          // L 10 8.59
          lineTo(x = 10.0f, y = 8.59f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 6.59
          horizontalLineToRelative(dx = 6.59f)
          // L 22 23.41
          lineTo(x = 22.0f, y = 23.41f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // M 8 8
          moveTo(x = 8.0f, y = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 20 20
          moveToRelative(dx = 20.0f, dy = 20.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
        }
        // M30 6 a4 4 0 0 0 -7.86 -1 H13 v2 h9.14 A4 4 0 0 0 25 9.86 V19 h2 V9.86 A4 4 0 0 0 30 6 m-4 2 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m-7 17 H9.86 A4 4 0 0 0 7 22.14 V13 H5 v9.14 A4 4 0 1 0 9.86 27 H19Z M6 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 6
          moveTo(x = 30.0f, y = 6.0f)
          // a 4 4 0 0 0 -7.86 -1
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -7.86f,
            dy1 = -1.0f,
          )
          // H 13
          horizontalLineTo(x = 13.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9.14
          horizontalLineToRelative(dx = 9.14f)
          // A 4 4 0 0 0 25 9.86
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 9.86f,
          )
          // V 19
          verticalLineTo(y = 19.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 9.86
          verticalLineTo(y = 9.86f)
          // A 4 4 0 0 0 30 6
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 6.0f,
          )
          // m -4 2
          moveToRelative(dx = -4.0f, dy = 2.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // m -7 17
          moveToRelative(dx = -7.0f, dy = 17.0f)
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // A 4 4 0 0 0 7 22.14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 22.14f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // H 5
          horizontalLineTo(x = 5.0f)
          // v 9.14
          verticalLineToRelative(dy = 9.14f)
          // A 4 4 0 1 0 9.86 27
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.86f,
            y1 = 27.0f,
          )
          // H 19z
          horizontalLineTo(x = 19.0f)
          close()
          // M 6 28
          moveTo(x = 6.0f, y = 28.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
      .also { _virtualPrivateCloudAlt = it }
  }

@Suppress("ObjectPropertyName")
private var _virtualPrivateCloudAlt: ImageVector? = null
